package com.bosssoft.hr.bes.exam.pojo.controller.controller;

import com.bosssoft.hr.bes.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yzq
 * @date 2019/11/25 0025
 * @time 下午 08:35
 */
@ResponseBody
@Controller
public class UserController {

    @Autowired
    UserService userServiceImpl;

    @RequestMapping("/addUser")
    public String addUser() {

        return "";
    }

}
