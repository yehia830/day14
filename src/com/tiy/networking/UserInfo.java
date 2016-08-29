package com.tiy.networking;

/**
 * Created by Yehia830 on 8/27/16.
 */
public class UserInfo {
    private String userName;

    public UserInfo(String userName) {
        this.userName = userName;
    }
    public UserInfo(){

    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
