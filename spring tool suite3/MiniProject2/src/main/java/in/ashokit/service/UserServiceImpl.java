package in.ashokit.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.LoginForm;
import in.ashokit.binding.SignUpForm;
import in.ashokit.binding.UnlockForm;
import in.ashokit.entity.UserDetailsEntity;
import in.ashokit.repo.UserDetailsRepo;
import in.ashokit.utility.EmailUtils;
import in.ashokit.utility.PwdUtils;
import jakarta.servlet.http.HttpSession;

import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDetailsRepo userDetailsRepo;
	@Autowired
	private EmailUtils emailUtils;
	@Autowired
	private HttpSession session;
	@Override
	public boolean signUp(SignUpForm form) {
		UserDetailsEntity user = userDetailsRepo.findByEmail(form.getEmail());
		if(user != null) {
			return false;
		}
		// Copy data from SignUpForm to UserDetailsEntity
		UserDetailsEntity entity = new UserDetailsEntity();
		BeanUtils.copyProperties(form, entity);

		// Generate a random password and set it
		String tempPwd = PwdUtils.generateRandomPwd(12);
		entity.setPwd(tempPwd);

		// Set account status as locked
		entity.setAccStatus("LOCKED");

		// Insert record (You need to implement this)
		//userDetailsRepo.save(entity);

		// Send email to unlock the record (You need to implement this)
		userDetailsRepo.save(entity);
		String to = form.getEmail();
		String subject = "Unlock Your Account";
		StringBuffer body = new StringBuffer("");
		body.append("<h1>Use Below Temporary Password To Unlock Your Account</h1>");
		body.append("Temporary pwd: "+ tempPwd);
		body.append("<br/>");
		body.append("<a href=\"http://localhost:8080/unlock?email=" + to + "\">Click Here To Unlock Your Account</a>");
		emailUtils.sendEmail(to, subject, body.toString());
		return true;
	}
	
	@Override
	public boolean unlockAccount(UnlockForm form) {
	    UserDetailsEntity entity = userDetailsRepo.findByEmail(form.getEmail());
	    if (entity != null && entity.getPwd().equals(form.getTempPwd())) {
	        entity.setPwd(form.getNewPwd());
	        entity.setAccStatus("Unlocked");
	        userDetailsRepo.save(entity);
	        return true;
	    } else {
	        return false;
	    }
	}
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public boolean forgotPass(String email) {
        if (!isValidEmail(email)) {
            logger.error("Invalid email format: {}", email);
            return false;
        }

        // Check record presence in db with given email
        UserDetailsEntity entity = userDetailsRepo.findByEmail(email);
        if (entity == null) {
            logger.error("No user found with email: {}", email);
            return false;
        }

        // Record available, send password to email and return success message
        String subject = "Recover Password";
        String body = "Your password: " + entity.getPwd();

        try {
            emailUtils.sendEmail(email, subject, body);
            return true;
        } catch (Exception e) {
            // Handle any exceptions that occur while sending the email
            logger.error("Failed to send email to: {}", email, e);
            return false;
        }
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (email == null) {
            return false;
        }
        return pattern.matcher(email).matches();
}
	
    @Override
	public String login(LoginForm form) {
		UserDetailsEntity entity = userDetailsRepo.findByEmailAndPwd(form.getEmail(), form.getPwd());
		if(entity == null) {
			return "Invalid Credentials";
		}
		if(entity.getAccStatus().equals("LOCKED")) {
			return "Your Account Locked";
		}
		//create session and store user data in session
		session.setAttribute("userId", entity.getUserId());
		return "SuccessFull";
	}

}
