package com.ljz.jit.pojo;

public class Role {
    private Integer roleid;

    private String rolename;

    private String menuids;

    private String operationids;

    private String roledescription;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getMenuids() {
        return menuids;
    }

    public void setMenuids(String menuids) {
        this.menuids = menuids == null ? null : menuids.trim();
    }

    public String getOperationids() {
        return operationids;
    }

    public void setOperationids(String operationids) {
        this.operationids = operationids == null ? null : operationids.trim();
    }

    public String getRoledescription() {
        return roledescription;
    }

    public void setRoledescription(String roledescription) {
        this.roledescription = roledescription == null ? null : roledescription.trim();
    }
}