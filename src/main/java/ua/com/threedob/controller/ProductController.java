package ua.com.threedob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.threedob.service.ProductService;

import java.util.HashMap;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

//    @RequestMapping(value = "/findproduct",method = RequestMethod.POST)
    @PostMapping("/findProduct")
    public String findByName(@RequestParam("searchbyproduct") String name, Model model){
        model.addAttribute("title",name);
        model.addAttribute("sproduct",productService.findByName(name));
        return "oneProductPage";
    }

    public String ProductDetails(@PathVariable("id") int id, Model model){
        HashMap<String,Object> map = new HashMap<String, Object>();
        map.put("title","single product page");
        map.put("product",productService.findOne(id));
        return "productDetailsPage";
    }
}
