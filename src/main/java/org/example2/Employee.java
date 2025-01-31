package org.example2;

public class Employee {
    private String name;
    private String role;
    public void setName(String name) {
        this.name = name;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public void displayInfo() {
        System.out.println("Employee Name: " + name + ", Role: " + role);
    }
}
