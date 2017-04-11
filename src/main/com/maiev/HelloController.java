package main.com.maiev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

/**
 * Created by maievshabu on 2017/4/7.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("hello", "Hello, World!");
        return "/tbj/hello";
    }

    @RequestMapping("/hello2")
    public String hello2(Model model){
        model.addAttribute("hello", "Hello, World!");
        return "hello";
    }
}
