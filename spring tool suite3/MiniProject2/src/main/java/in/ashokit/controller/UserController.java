package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.binding.LoginForm;
import in.ashokit.binding.SignUpForm;
import in.ashokit.binding.UnlockForm;
import in.ashokit.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

@PostMapping("/signUp")
public String handleSignUp(@ModelAttribute("user") SignUpForm form, Model model) {
	boolean status = userService.signUp(form);
	if(status) {
		model.addAttribute("succMsg","Account Created, Check Your Email");
	}else {
		model.addAttribute("errMsg","Choose Unique Email");
	}
	return "signUp";
}

@GetMapping("/login")
public String loginPage(Model model) {
	model.addAttribute("loginForm", new LoginForm());
	return "login";
}


@PostMapping("/login")
public String login(@ModelAttribute("loginForm") LoginForm loginForm, Model model) {
	String status = userService.login(loginForm);
	if(status.contains("SuccessFull")) {
		
		return "redirect:/dashboard";
	}
	model.addAttribute("errMsg", status);
	return "login";
}


@GetMapping("/signUp")
public String SignUpPage(Model model) {
	
	model.addAttribute("user", new SignUpForm());
	return "signUp";
}
@GetMapping("/unlock")
public String unlockPage(@RequestParam(required = false) String email, Model model) {
    UnlockForm unlockFormObj = new UnlockForm();
    unlockFormObj.setEmail(email);
    model.addAttribute("unlock", unlockFormObj);

    return "unlock";
}

@PostMapping("/unlock")
public String unlockUserAccount(@ModelAttribute("unlock") UnlockForm unlock, Model model) {
	System.out.println(unlock);
	if(unlock.getNewPwd().equals(unlock.getConfirmPwd())) {
		boolean status = userService.unlockAccount(unlock);
		if(status) {
			model.addAttribute("succMsg","Your Account Unlock Successfully....");
		}else {
			model.addAttribute("errMsg","Your Temporary Password is Incorrect.......");
		}
	} else {
	model.addAttribute("errMsg","New Pwd and Confirm Pwd Should be Same.............");
	}
	return "unlock";
}

@GetMapping("/forgotPass")
public String ForgotPasswordPage() {
	return "forgotPass";
}

@PostMapping("/forgotPass")
public String ForgotPassword(@RequestParam("email") String email, Model model) {
	System.out.println(email);
	boolean status = userService.forgotPass(email);
	if(status) {
		//success msg
		model.addAttribute("succMsg","Pwd sent to your Email");
	}else {
		//error msg
		model.addAttribute("errMsg","Invalid Email");
	}
	
	return "forgotPass";
}

}
