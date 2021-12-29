package com.set.training.builder;

public class Person {
    private Name name;
    private String hobby;

    private Person(Builder b) {

    }

    public static class Builder {
        private Name name;
        private String hobby;

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder setHobby(String hobby) {
            this.hobby = hobby;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
