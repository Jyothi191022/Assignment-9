package com.codegnan.controlstatements;

import java.util.Scanner;

public class EmployeeBonusCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter role code and salary: ");
        int code = sc.nextInt();
        int salary = sc.nextInt();
        int bonus;
        switch (code) {
            case 1: 
                bonus = (int)(salary * 0.10);
                System.out.println(bonus);
                break;
            case 2: 
                bonus = (int)(salary * 0.05);
                System.out.println(bonus);
                break;
            case 3: 
                bonus = 500;
                System.out.println(bonus);
                break;
            default:
                System.out.println("Invalid Role");
        }
        sc.close();
	}

}
