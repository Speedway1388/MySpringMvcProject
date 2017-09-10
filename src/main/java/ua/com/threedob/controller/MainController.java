package ua.com.threedob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.com.threedob.entity.User;
import ua.com.threedob.service.ProductService;
import ua.com.threedob.service.UserService;

/**
 * Created by Yurij on 19.08.2017.
 */
@Controller
public class MainController {

    @Autowired
    UserService userService;
    @Autowired
    ProductService productService;

 //   @RequestMapping("/")
/*    public String toMainPage(Model model){
        model.addAttribute("findAllUsers",userService.findAll());
        model.addAttribute("findAllProducts", productService.findAll());
        model.addAttribute("emptyUser", new User());
        return "index";
    }*/
//    @RequestMapping(value = "user",method = RequestMethod.POST)
//    public String addUser(@RequestParam("userName") String userName,
//                          @RequestParam("userSurName") String userSurName,
//                          @RequestParam("email")  String email,
//                          @RequestParam("password")  String password){
//
//        userService.save(userName, userSurName, email, password);
//        return "usersList";
//    }
    @RequestMapping(value = "user",method = RequestMethod.POST)
    public String addUser(@ModelAttribute User user){
        userService.save(user);
        return "redirect:/";
    }
    @RequestMapping("/")
    public String toMainPage(Model model){
//        model.addAttribute("findAllUsers",userService.findAll());
//        model.addAttribute("findAllProducts", productService.findAll());
//        model.addAttribute("emptyUser", new User());
        return "main";
    }
}
