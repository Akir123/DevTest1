package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.binding.LoginForm;
import in.ashokit.binding.SignUpForm;
import in.ashokit.binding.UnlockForm;

@Service
public interface UserService {
public String login(LoginForm form);
public boolean signUp(SignUpForm form);
public boolean unlockAccount(UnlockForm form);
public boolean forgotPass(String email);
}
