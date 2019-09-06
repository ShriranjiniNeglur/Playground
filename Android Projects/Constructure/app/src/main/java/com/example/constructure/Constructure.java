package com.example.constructure;

public class Constructure {

    private String Name;
    private int age;
    private String mail;

    public Constructure(String name, int age, String mail) {
        Name = name;
        this.age = age;
        this.mail = mail;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
