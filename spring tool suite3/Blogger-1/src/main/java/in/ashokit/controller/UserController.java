package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import in.ashokit.entity.User;
import in.ashokit.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/registration")
    public String getRegistration() {
        return "registration";
    }

    @PostMapping("/registration")
    public ModelAndView postRegistration(@RequestParam("firstName") String firstName,
                                         @RequestParam("lastName") String lastName,
                                         @RequestParam("email") String email,
                                         @RequestParam("password") String password,
                                         Model model) {
        User user = new User();
        user.setFname(firstName);
        user.setLname(lastName);
        user.setEmail(email);
        user.setPwd(password);

        userService.saveUser(user);

        model.addAttribute("successMessage", "Registration successful!");
        return new ModelAndView("registration");
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView postLogin(@RequestParam("email") String email,
                                  @RequestParam("password") String password,
                                  Model model) {
        User user = userService.loginUser(email, password);
        if (user != null) {
            return new ModelAndView("dashboard");
        } else {
            model.addAttribute("errorMessage", "Invalid Email or Password");
            return new ModelAndView("login");
        }
    }

    @GetMapping("/dashboard")
    public String getDashboard() {
        return "dashboard";
    }
    
    @GetMapping("/blogPage")
    public String getBlogPage() {
        return "blogPage";
    }
    
    @GetMapping("/view")
    public String getView() {
        return "view";
    }
    
    @GetMapping("/viewCommentsPage")
    public String getViewCommentsPage() {
        return "viewCommentsPage";
    }
}
