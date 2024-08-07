package cinemas.controllers;

import cinemas.models.User;
import cinemas.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home(Model model) {
        var user = new User();
        user.setFullName("Sun Asterisk");
        user.setEmail("Japan@b.com");
        var savedUser = userService.save(user);
        model.addAttribute("user", savedUser);
        userService.delete(savedUser);
        return "user/home-page";
    }

}
