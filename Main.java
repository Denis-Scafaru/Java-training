package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner fizzBuzzScanner = new Scanner(System.in);
        System.out.println("introduceti un numar <= 100");
        int n = fizzBuzzScanner.nextInt();
       if ( (n % 3 ==0) && (n % 5==0) ){
            System.out.println("FizzBuzz");}
        else if (n % 5 == 0 ) {
            System.out.println("Fizz");
        }
        else if (n % 3 == 0) {
            System.out.println("Buzz");
        }

        else {
            System.out.println("Nu este divizibil cu 3 sau 5");
        }
    }
}
