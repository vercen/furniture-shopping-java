package com.edu.furn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author vercen
 * @version 1.0
 * @date 2023/3/19 23:27
 */
@Controller
public class TestController {
    @RequestMapping("/hi")
    public String hi(){
        System.out.println("TestController-hi");
        return "hi";
    }
}
