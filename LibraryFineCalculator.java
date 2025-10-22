package com.codegnan.controlstatements;

import java.util.Scanner;

public class LibraryFineCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter code and days overdue: ");
        int code = sc.nextInt();
        int days = sc.nextInt();
        int fine;
        switch (code) {
            case 1:
                if (days >= 1 && days <= 5) {
                    fine = days * 1;
                    System.out.println(fine);
                } else {
                    System.out.println("Invalid Code");
                }
                break;
            case 2:
                if (days >= 6 && days <= 10) {
                    fine = days * 2;
                    System.out.println(fine);
                } else {
                    System.out.println("Invalid Code");
                }
                break;
            case 3:
                if (days > 10) {
                    fine = days * 5;
                    System.out.println(fine);
                } else {
                    System.out.println("Invalid Code");
                }
                break;
            default:
                System.out.println("Invalid Code");
        }
        sc.close();
	}

}
