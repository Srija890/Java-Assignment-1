package com.stackroute.pe1;

import java.util.Scanner;

public class TomOrJerry {
    public void checkTomOrJerry() {
        int num;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num > 20 && num < 30) {
            if (num % 2 == 0) {
                System.out.println("Tom and number is even and exits between 20 and 30");
            } else {
                System.out.println("Jerry and number is odd and exits between 20 and 30");
            }

        }

    }
}