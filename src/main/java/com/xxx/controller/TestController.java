package com.xxx.controller;

import com.xxx.common.assignment.GetFlag;
import com.xxx.common.consts.ReData;
import com.xxx.common.util.ReUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wyl on 2017-06-13.
 */
@Controller
public class TestController {

    @RequestMapping("login")
    public String index(Model model){
        model.asMap();
        return "login";
    }

    @RequestMapping("register")
    public String register(){
        return "register";
    }

    @RequestMapping("image")
    public String image(){
        return "image";
    }

    @RequestMapping("findback")
    public String test(){
        return "findback";
    }

    @RequestMapping("column")
    public String column(){
        return "column";
    }

    @RequestMapping("logout")
    public String logout(){
        GetFlag.IntoFlag=false;
        return "login";
    }

    @RequestMapping("getLogin")
    @ResponseBody
    public ReData getMessage(){
        GetFlag.IntoFlag=true;
        return ReUtil.success("");
    }


}
