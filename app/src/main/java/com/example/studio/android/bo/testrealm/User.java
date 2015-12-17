package com.example.studio.android.bo.testrealm;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.PrimaryKey;

/**
 * Created by User on 12/17/2015.
 */
public class User extends RealmObject{
    @PrimaryKey
    private String userName;
    private int userAge;

    @Ignore
    private int sessionId;

    public String getUserName(){
        return userName;

    }
    public void setUserName(String name){
        this.userName = name;

    }
    public int getUserAge(){
        return userAge;
    }
    public void setUserAge(int age){
        this.userAge = age;
    }
    public int getSessionId(){
        return sessionId;
    }
    public void setSessionId(int sessionId){
        this.sessionId = sessionId;
    }

}
