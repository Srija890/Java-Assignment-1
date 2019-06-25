package com.stackroute.pe1;

import java.util.Scanner;
import java.lang.String;

public class Main {
    //    main method
    public static void main(String[] args) {

        int option;

//        Instantiation
     Palindrome palindrome = new Palindrome();
     TomOrJerry TomOrJerry= new TomOrJerry();
     VowelConsonants VowelConsonants=new VowelConsonants();
     CapitalLetters CapitalLetters=new CapitalLetters();
     Loop Loop=new Loop();
       Sorting Sorting =new Sorting();
        StringReverse StringReverse = new StringReverse();
        NumberSeries NumberSeries=new NumberSeries();
        SumOfArray SumOfArray =new SumOfArray();
        RepeatCharacter RepeatCharacter=new RepeatCharacter();
        GuessNumber GuessNumber=new GuessNumber();
        System.out.println("Enter the option");
        System.out.println("1.com.stackroute.pe1.Palindrome\t2.com.stackroute.pe1.TomOrJerry\t3.com.stackroute.pe1.VowelConsonants\t4.com.stackroute.pe1.CapitalLetters\t5.com.stackroute.pe1.Loop\t6.com.stackroute.pe1.Sorting\t7.com.stackroute.pe1.StringReverse\t8.com.stackroute.pe1.NumberSeries\t9.com.stackroute.pe1.SumOfArray\t10.com.stackroute.pe1.RepeatCharacter\t11.com.stackroute.pe1.GuessNumber");
        //      Read option
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();

        switch (option) {
            case 1:
                palindrome.checkPalindrome();
                break;
            case 2:
                TomOrJerry.checkTomOrJerry();
                break;
            case 3:
                VowelConsonants.checkVowelConsonants();
                break;
            case 4:
                CapitalLetters.checkCapitalLetters();
                break;
            case 5:
                Loop.checkLoop();
                break;
            case 6:
                Sorting.checkSorting();

                break;
                case 7:
                StringReverse.checkStringReverse();
                break;
            case 8:
                NumberSeries.checkNumberSeries();
                break;
            case 9:
                SumOfArray.checkSumOfArray();
                break;
            case 10:
                RepeatCharacter.checkRepeatCharacter();
                break;
            case 11:
                GuessNumber.checkGuessNumber();
                break;
            default:
                System.out.println(("Not a valid option"));

        }
    }
}