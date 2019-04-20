package com.ljz.jit.pojo;

public class Menu {
    private Integer menuid;

    private String menuname;

    private String menuurl;

    private Integer parentid;

    private String menudescription;

    private String state;

    private String iconcls;

    @Override
    public String toString() {
        return "Menu{" +
                "menuid=" + menuid +
                ", menuname='" + menuname + '\'' +
                ", menuurl='" + menuurl + '\'' +
                ", parentid=" + parentid +
                ", menudescription='" + menudescription + '\'' +
                ", state='" + state + '\'' +
                ", iconcls='" + iconcls + '\'' +
                ", seq=" + seq +
                '}';
    }

    private Integer seq;

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl == null ? null : menuurl.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getMenudescription() {
        return menudescription;
    }

    public void setMenudescription(String menudescription) {
        this.menudescription = menudescription == null ? null : menudescription.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getIconcls() {
        return iconcls;
    }

    public void setIconcls(String iconcls) {
        this.iconcls = iconcls == null ? null : iconcls.trim();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }
}