package com.example.demotest_spring_thymeleaf_saito.form;

import java.util.List;

public class MemberForm {

    private String name;

    private String age;

    private List<String> hobbyList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIntAge() {
        return Integer.valueOf(age);
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<String> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

}
