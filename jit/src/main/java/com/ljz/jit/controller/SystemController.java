package com.ljz.jit.controller;

import com.ljz.jit.service.SystemService;
import com.ljz.jit.vo.UsersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SystemController {

    @Autowired
    private SystemService systemService;
    /**
     * 查询全部的用户信息
     * @return
     */
    @GetMapping("/system/users")
    public String Users(Model model){
        List<UsersVo> list = systemService.findUsers();
        model.addAttribute("users",list);
        return "System/users";
    }

    @GetMapping("/system/user")
    public String toAdd(){
        return null;
    }
}
