package Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

public class userController {
    @Autowired
    private userService userService;

    @PostMapping ("/new")
    public String add(Model model) {

        return "redirect/complete.html";
    }
    @PostMapping (value = "/save")
    public String saveUser(@RequestParam("user") String name,@RequestParam("Phone") Integer Phone,@RequestParam("Email") String Email){
        user u = new user();
        u.setName(name);
        u.setPhone(Phone);
        u.setEmail(Email);
        userService.save(u);
        return "redirect/complete.html";
    }


}
