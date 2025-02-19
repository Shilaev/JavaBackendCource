package ru.shilaev.models;

import javax.validation.constraints.*;

public class Person {
    private int id;

    @NotEmpty(message = "Name shouldn`t be empty")
    @Size(min = 2, max = 10, message = "Name should be between 2 and 30 characters")
    private String name;

    @Min(value = 0, message = "Value can't be lower then 0")
    @Max(value = 100, message = "Value can't be higher then 0")
    private int age;

    @Email(message = "Email should be valid")
    private String email;

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
