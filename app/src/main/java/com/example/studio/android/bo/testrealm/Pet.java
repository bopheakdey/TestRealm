package com.example.studio.android.bo.testrealm;

import io.realm.RealmObject;
import io.realm.annotations.Required;

/**
 * Created by User on 12/17/2015.
 */
public class Pet extends RealmObject {
    @Required
    private String name;
    private int type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}