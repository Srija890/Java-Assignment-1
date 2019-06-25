package com.stackroute.pe1;

import java.util.Scanner;

public class CapitalLetters {

    public void checkCapitalLetters() {
        char character;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        character = sc.next().charAt(0);
        if(character>=97 && character<=122)
        {
            System.out.println("Small case letters");
        }else if(character>=65 && character<=90){
            System.out.println("Capital letters");
        }else if(character>=48 && character<=57){
            System.out.println("Digit");
        }else{
            System.out.println("Symbols");
        }


    }

}









