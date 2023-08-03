package com.workintech.company;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name) {
        super(id, name);
    }
    public void work(){
        System.out.println(getName() + " Junior Developer starts to working");
        setSalary(20000);
    }
}
