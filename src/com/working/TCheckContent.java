package com.working;


import java.util.List;


public class TCheckContent {

    private String id;

    private String checkId;

    private String bType;

    private String sType;

    private String content;

    private String pics;

    private List<String> picUrls;
    private String principal;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    public String getbType() {
        return bType;
    }

    public void setbType(String bType) {
        this.bType = bType;
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public List<String> getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(List<String> picUrls) {
        this.picUrls = picUrls;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    @Override
    public String toString() {
        return "TCheckContent{" +
                "id='" + id + '\'' +
                ", checkId='" + checkId + '\'' +
                ", bType='" + bType + '\'' +
                ", sType='" + sType + '\'' +
                ", content='" + content + '\'' +
                ", pics='" + pics + '\'' +
                ", picUrls=" + picUrls +
                ", principal='" + principal + '\'' +
                '}';
    }
}
