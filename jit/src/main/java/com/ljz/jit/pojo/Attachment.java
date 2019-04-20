package com.ljz.jit.pojo;


public class Attachment {
    private Integer attachmentid;

    private String attachmentname;

    private String attachmentpath;

    private String attachmenttime;

    public Integer getAttachmentid() {
        return attachmentid;
    }

    public void setAttachmentid(Integer attachmentid) {
        this.attachmentid = attachmentid;
    }

    public String getAttachmentname() {
        return attachmentname;
    }

    public void setAttachmentname(String attachmentname) {
        this.attachmentname = attachmentname == null ? null : attachmentname.trim();
    }

    public String getAttachmentpath() {
        return attachmentpath;
    }

    public void setAttachmentpath(String attachmentpath) {
        this.attachmentpath = attachmentpath == null ? null : attachmentpath.trim();
    }

    public String getAttachmenttime() {
        return attachmenttime;
    }

    public void setAttachmenttime(String attachmenttime) {
        this.attachmenttime = attachmenttime == null ? null : attachmenttime.trim();
    }
}