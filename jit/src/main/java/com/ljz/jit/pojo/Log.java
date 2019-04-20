package com.ljz.jit.pojo;

public class Log {
    private Integer logid;

    private String username;

    private String createtime;

    private String operation;

    @Override
    public String toString() {
        return "Log{" +
                "logid=" + logid +
                ", username='" + username + '\'' +
                ", createtime='" + createtime + '\'' +
                ", operation='" + operation + '\'' +
                ", ip='" + ip + '\'' +
                ", module='" + module + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    private String ip;

    private String module;

    private String content;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}