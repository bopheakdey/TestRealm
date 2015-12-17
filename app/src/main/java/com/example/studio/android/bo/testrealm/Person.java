package com.example.studio.android.bo.testrealm;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by User on 12/17/2015.
 */
public class Person extends RealmObject {

    private String fullName;
    private int age;
    private RealmList<Pet> pets;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public RealmList<Pet> getPets() {
        return pets;
    }

    public void setPets(RealmList<Pet> pets) {
        this.pets = pets;
    }
}
