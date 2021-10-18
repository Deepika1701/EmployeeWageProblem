package com.bridgelabs;

public class EmployeeAttendanceUC1 {

    public static void main(String args[]) {

        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        double randomNum = Math.random();
        System.out.println(randomNum);
        double randomNum2 = randomNum * 10;
        System.out.println(randomNum2);
        double randomNum3 = Math.floor(randomNum2);
        System.out.println(randomNum3);
        double finalNum = randomNum3 % 2;
        System.out.println(finalNum);
        if(empCheck == IS_FULL_TIME)
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }
    }
}
