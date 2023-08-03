package com.workintech.company;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name) {
        super(id, name);
    }
    public void work(){
        System.out.println(getName() + " Junior Developer starts to working");
        setSalary(20000);
    }
}