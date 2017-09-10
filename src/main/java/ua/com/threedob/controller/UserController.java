package ua.com.threedob.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.com.threedob.entity.User;
import ua.com.threedob.service.UserService;

import java.util.List;

/**
 * Created by Yurij on 24.08.2017.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping(value = "showAllUsersWithPurchase", method = RequestMethod.GET)
//    @GetMapping("showAllUsersWithPurchase")
    private String showAllUsersWithPurchase(Model model){
        List<User> users = userService.fetchPurchase();
        model.addAttribute("allUsersWithPurchase" , users);
 //       model.addAttribute("users",userService.findAll());
        return "allUsers";
    }
//    @RequestMapping(value = "userspurchase",method = RequestMethod.POST)
//    private String showAllUsersWithPurchase(Model model){
//
//
//        return "allUsers";
//    }
}
