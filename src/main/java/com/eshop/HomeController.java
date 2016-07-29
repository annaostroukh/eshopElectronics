package com.eshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anna on 27.07.2016.
 */

@Controller
public class HomeController {

    @RequestMapping("/") //when request is pointing on root directory
    public String home() {
        return "home";
    }

}
