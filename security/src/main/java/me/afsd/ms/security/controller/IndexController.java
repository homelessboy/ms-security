package me.afsd.ms.security.controller;

import me.afsd.site.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;


/**
 * @author XuHui (416422546@qq.com)
 * @version 0.0.1
 */
@Controller
public class IndexController extends BaseController{

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("date", new Date());
        System.out.println("inadfasdf");
        model.addAttribute("message", "test");
        model.addAttribute("title", "Hello Home");
        return "home";
    }

    @RequestMapping("/foo")
    public String foo() {
        throw new RuntimeException("Expected exception in controller");
    }
}
