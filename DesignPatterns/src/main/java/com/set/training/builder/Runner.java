package com.set.training.builder;

public class Runner {
    public static void main(String[] args) {
        Name name = new Name.Builder().setFirstName("Raj").setLastName("Aryan").build();
        Person person = new Person.Builder().setName(name).setHobby("Dancing").build();
    }
}
