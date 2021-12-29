package com.set.training.builder;

public class Name {

    private String firstName;
    private String lastName;

    private Name(Builder b) {
        this.firstName = b.firstName;
        this.lastName = b.lastName;
    }

    public static class Builder {
        private String firstName;
        private String lastName;

        public Builder setFirstName(String name) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String name) {
            this.lastName = lastName;
            return this;
        }

        public Name build() {
            return new Name(this);
        }
    }

}
