package com.ljz.jit.controller;



import com.ljz.jit.pojo.Menu;
import com.ljz.jit.pojo.Role;
import com.ljz.jit.pojo.User;
import com.ljz.jit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 个人信息管理
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录功能
     * @param username 账号
     * @param password 密码
     * @param session
     * @return
     */
    @PostMapping(value="/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session){
        Map<String,Object> map = new HashMap<String,Object>();
        User user = userService.login(username,password);
        if(user==null){
            return "login";
        }else{
            Role role = userService.status(user.getRoleid());
            map.put("role",role);
            map.put("user",user);
            map.put("menus",userService.findMenus(role));
            session.setAttribute("userMap",map);
            return "index";
        }
    }




    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
}
