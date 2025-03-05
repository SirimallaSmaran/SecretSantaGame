package com.secretsanta.model;

public class Employee {
    private String name;
    private String email;
    private Employee secretChild;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Employee getSecretChild() {
        return secretChild;
    }

    public void setSecretChild(Employee secretChild) {
        this.secretChild = secretChild;
    }
}
