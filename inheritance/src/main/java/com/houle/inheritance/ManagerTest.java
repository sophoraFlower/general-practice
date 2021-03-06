package com.houle.inheritance;

public class ManagerTest {

    public static void main(String[] args) {
        // construct a Manager object
        // Employee boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        // ((Manager) boss).setBonus(5000);

        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];
        // var staff = new Employee[3];
        // fill the staff array with Manager and Employee objects
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }

        Manager boss2 = (Manager) staff[0];
        if (staff[1] instanceof Manager) {
            Manager boss3 = (Manager) staff[1];
            System.out.println(boss3.getBonus());
        }
        System.out.println(boss2.getBonus());
    }
}
