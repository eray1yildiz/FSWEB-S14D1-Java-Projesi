package com.workintech.main;

import com.workintech.company.*;

import java.util.Arrays;

public class CompanyMain {
    public static void main(String[] args) {
        Employee asci = new Employee(8, "Murat");
        asci.work();

        JuniorDeveloper junior1 = new JuniorDeveloper(2, "Ayşe");
        junior1.work();
        JuniorDeveloper junior2 = new JuniorDeveloper(3, "Ahmet");
        junior2.work();
        JuniorDeveloper junior3 = new JuniorDeveloper(4, "Ömer");
        junior3.work();

        MidDeveloper mid1 = new MidDeveloper(5, "Mehmet");
        mid1.work();
        MidDeveloper mid2 = new MidDeveloper(6, "Fatma");
        mid2.work();

        SeniorDeveloper senior = new SeniorDeveloper(7, "Kuzey");
        senior.work();



        HRManager hrManager = new HRManager(1, "Ali", new JuniorDeveloper[3], new MidDeveloper[2], new SeniorDeveloper[1]);
        hrManager.work();
        System.out.println("HR Manager Salary: " + hrManager.getSalary());
        System.out.println("Senior Salary: " + senior.getSalary());



        hrManager.addEmployee(0, junior1);
        hrManager.addEmployee(1,junior2);
        hrManager.addEmployee(2,junior3);
        hrManager.addEmployee(0, mid1);
        hrManager.addEmployee(1, mid2);
        hrManager.addEmployee(0, senior);
        hrManager.addEmployee(2,senior);

        System.out.println("---------------");
        System.out.println("Juniors " + Arrays.toString(hrManager.getJuniorDevelopers()));
        System.out.println("Mids " + Arrays.toString(hrManager.getMidDevelopers()));
        System.out.println("Seniors " + Arrays.toString(hrManager.getSeniorDevelopers()));
    }
}