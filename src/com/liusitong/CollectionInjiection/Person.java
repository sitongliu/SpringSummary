package com.liusitong.CollectionInjiection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LiuSitong on 2017/4/23.
 */
public class Person {
    private  int age;
    private String name;
    private Map<Integer,Person> friend = new HashMap<Integer, Person>();
    private List<String> favorites = new ArrayList<String>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, Person> getFriend() {
        return friend;
    }

    public void setFriend(Map<Integer, Person> friend) {
        this.friend = friend;
    }

    public List<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", friend=" + friend +
                ", favorites=" + favorites +
                '}';
    }
}
