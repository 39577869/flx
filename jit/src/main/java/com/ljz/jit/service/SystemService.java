package com.ljz.jit.service;

import com.ljz.jit.mapper.RoleMapper;
import com.ljz.jit.mapper.UserMapper;
import com.ljz.jit.pojo.Role;
import com.ljz.jit.pojo.User;
import com.ljz.jit.vo.UsersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SystemService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    /**
     * 查询所有用户信息
     * @return
     */
    public List<UsersVo> findUsers(){
        List<UsersVo> list = new ArrayList<UsersVo>();
        List<User> userlist = userMapper.selectByExample(null);
        for (User user:userlist) {
            Role role = roleMapper.selectByPrimaryKey(user.getRoleid());
            list.add(new UsersVo(user,role.getRolename()));
        }
        return list;
    }

    /**
     * 查询所有角色信息
     * @return
     */
    public List<Role> findRoles(){
        List<Role> list = roleMapper.selectByExample(null);
        return list;
    }
}
