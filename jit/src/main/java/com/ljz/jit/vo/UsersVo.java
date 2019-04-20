package com.ljz.jit.vo;

import com.ljz.jit.pojo.User;

public class UsersVo {
    private User user;
    private String role;

    public User getUser() {
        return user;
    }

    public UsersVo(){}
    public UsersVo(User user, String role) {
        this.user = user;
        this.role = role;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
