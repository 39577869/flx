package com.ljz.jit.service;

import com.ljz.jit.mapper.MenuMapper;
import com.ljz.jit.mapper.RoleMapper;
import com.ljz.jit.mapper.UserMapper;
import com.ljz.jit.pojo.Menu;
import com.ljz.jit.pojo.Role;
import com.ljz.jit.pojo.User;
import com.ljz.jit.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private MenuMapper menuMapper;

    /**
     * 用户登录操作
     * @param username
     * @param password
     * @return
     */
    public User login(String username,String password){
        User user = userMapper.selectByUserName(username);
        if(user!=null&&user.getPassword().equals(password)){
            return user;
        }
        return null;
    }

    /**
     * 查询用户所属的角色
     * @return
     */
    public Role status(Integer roleId){
        return roleMapper.selectByPrimaryKey(roleId);
    }

    /**
     * 查询用户可以操作的菜单
     * @param menuIds
     * @return
     */
    public List<Menu> findMenus(Role role) {
        return menuMapper.selectByIds(role.getMenuids());
    }
}
