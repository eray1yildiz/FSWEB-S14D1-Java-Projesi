package com.workintech.company;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name) {
        super(id, name);
    }
    public void work(){
        System.out.println(getName() + " Mid Developer starts to working");
        setSalary(30000);
    }
}