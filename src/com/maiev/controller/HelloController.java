package com.maiev.controller;

import com.maiev.dao.IProductDao;
import com.maiev.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

import com.maiev.service.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by maievshabu on 2017/4/7.
 */
@Controller
public class HelloController {
    @Autowired
    @Qualifier("productService")
    private IProductService productService;

    @Resource(name = "productDao")
    private IProductDao productDao;

    @RequestMapping("/hello")
    public String hello(Model model){

//        String h = productService.helloWorld();
        String h = productDao.helloWorld();

        model.addAttribute("hello", h);
        return "/tbj/hello";
    }

    @RequestMapping("/hello2")
    public String hello2(Model model){
        model.addAttribute("hello", "Hello, World!");
        return "hello";
    }

    @RequestMapping("/prodlist")
    @ResponseBody()
    public List<Product> list()
    {
        List<Product> list = productDao.getProdList();

        return list;
    }
}
