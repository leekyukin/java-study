package com.java.builder;

import java.time.LocalDateTime;

public class Person {

    private String name;
    private int age;
    private LocalDateTime birthday;
    private Sex sex;

    public static Person builder() {
        return new Person();
    }

    public Person name(String name) {
        this.name = name;
        return this;
    }

    public Person age(int age) {
        this.age = age;
        return this;
    }

    public Person birthday(LocalDateTime birthday) {
        this.birthday = birthday;
        return this;
    }

    public Person sex(Sex sex) {
        this.sex = sex;
        return this;
    }

    public Person build() {
        return this;
    }
}
