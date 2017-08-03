package cn.cwx521.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ll {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String ll(){
        return "index";
    }  @RequestMapping(value = "fail", method = RequestMethod.GET)
    public String f(){
        return "fail";
    }

}
