package com.example.demo3.common;

public class ActionForward {
    //define Attributes
    private String path;
    private boolean redirect;
    public ActionForward() {
    }
    public ActionForward(String path, boolean redirect) {
        this.path = path;
        this.redirect = redirect;
    }
    //get, set Attributes
    public String getPath() {
        return path;
    }
    public void setPath(String path){
        this.path = path;
    }
    public boolean getRedirect() {
        return redirect;
    }
    public void setRedirect(boolean redirect){
        this.redirect = redirect;
    }
}
