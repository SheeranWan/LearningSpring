package com.sheeranwan.learningspring.stream;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable
{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
