package com.java.builder;

import java.time.LocalDateTime;

public class TestMain {
    public static void main(String[] args) {
        Person person = Person.builder()
                .birthday(LocalDateTime.now())
                .name("이규진")
                .age(18)
                .build();
    }
}
