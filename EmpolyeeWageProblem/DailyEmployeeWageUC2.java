package com.bridgelabs;

public class DailyEmployeeWageUC2 {

    public static void main(String args[]) {

        int IS_FULL_TIME = 1;
        int SALARY_PER_HOUR = 20;
        int salary = 0;
        int empHour = 8;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        double randomNum = Math.random();
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
            empHour = 0;
        }
        salary = empHour * SALARY_PER_HOUR ;
        System.out.println("Daily employee wage = " +salary);
    }
}
