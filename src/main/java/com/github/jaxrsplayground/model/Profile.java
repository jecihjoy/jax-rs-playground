package com.github.jaxrsplayground.model;

public class Profile {
    private long id;
    private String name;
    private String gender;
    private String age;

    public Profile() {
    }

    public Profile(long id, String name, String gender, String age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
