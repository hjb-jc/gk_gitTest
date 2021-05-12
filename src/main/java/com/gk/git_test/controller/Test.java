package com.gk.git_test.controller;

public class Test {

    public int age;

    public Test() {
    }

    public Test(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                '}';
    }
}
