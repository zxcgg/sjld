package cn.cwx521.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ll {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String ll() {



        return "index";
    }

    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public String edit() {
        return "edit";
    }

    @RequestMapping(value = "table", method = RequestMethod.GET)
    public String table() {
        return "table";
    }

    @RequestMapping(value = "fail", method = RequestMethod.GET)
    public String f() {
        return "fail";
    }

    @RequestMapping(value = "upload", method = RequestMethod.GET)
    public String upload() {
        return "upload";
    }

    @RequestMapping(value = "download", method = RequestMethod.GET)
    public String download() {
        return "download";
    }


}
