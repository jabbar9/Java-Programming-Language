import java.util.Scanner;
import java.util.*;
public class javaBasic{
    public static void main(String args[]){        
        // int age = 16;
        // if(age >= 18) {
        //     System.out.println("Adult");
        // }
        // if(age >=13 && age <=16) {
        //     System.out.println("Teenager");
        // } else {
        //     System.out.println("Not Adult");
        // }

        //Largest among 2
        // int num1 = 2;
        // int num2 = 5;
        // if(num1 >= num2) {
        //     System.out.println("First Number is Greater");
        // } else {
        //     System.out.println("Second Number is Greater");
        // }

        //Even Odd
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();

        // if(number%2==0){
        //     System.out.println("Even Number");
        // } else {
        //     System.out.println("Odd Number");
        // }

        //Else if
        // int age = 22;
        // if(age >= 18) {
        //     System.out.println("Adult");
        // }
        // else if(age >=13 && age <=16) {
        //     System.out.println("Teenager");
        // } else {
        //     System.out.println("Not Adult");
        // }

        //Income Tax Calculator
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax;

        // if(income < 500000){
        //     tax = 0;
        // } else if(income >= 500000 && income <= 1000000){
        //     tax = (int) (income * 0.2);
        // } else {
        //     tax = (int) (income * 0.3);
        // }

        // System.out.println("Your Income is: " + tax);

        //Largest among three
        // int A = 1, B = 3, C = 6;

        // if((A>=B) && (A>=C)){
        //     System.out.println("A is Largest");
        // } else if(B>=C) {
        //     System.out.println("B is largest");
        // } else {
        //     System.out.println("C is Largest");
        // }

        //Ternary Operator
        // int marks = 50;
        // String status = (marks >= 33) ? "Pass" : "Fail";
        // System.out.println(status);

        //Switch Statement
        // int number = 2;
        // switch(number) {
        //     case 1 : System.out.println("Drinks");
        //              break;
        //     case 2 : System.out.println("Lunch");
        //              break;
        //     case 3 : System.out.println("Dinner");
        //              break;
        //     default : System.out.println("Breakfast");
        // }


        //Calculator Using Switch Statement
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a:- ");
        // int a = sc.nextInt();
        // System.out.println("Enter b:- ");
        // int b = sc.nextInt();
        // System.out.println("Enter operator:- ");
        // char operator = sc.next().charAt(0);

        // switch (operator) {
        //     case '+': System.out.println(a+b);
        //               break;
        //     case '-': System.out.println(a-b);
        //               break;
        //     case '*': System.out.println(a*b);
        //               break;
        //     case '/': System.out.println(a/b);
        //               break;
        //     case '%': System.out.println(a%b);
        //               break;
        //     default: System.out.println("Invalid Input");
        // }

        // int counter = 0;
        // while (counter < 100) {
        //     System.out.println("Hello World");
        //     counter++;
        // }
        // System.out.println("Printed Hello world 100times");

        //Type Promotion
        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = (byte) (a + b + c);
        // System.out.println(bt);

        //Print 1 to 10 using while loop
        // int counter = 1;
        // while(counter<=10){
        //     System.out.println(counter);
        //     counter++;
        // }
        
        //1 to n
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int counter = 1;
        // while(counter<=n){
        //     System.out.println(counter);
        //     counter++;
        // }

        //Sum of first n natural numbers
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while(i<=n){
        //     sum += i; //sum = sum + i;
        //     i++;
        // }
        // System.out.println("Sum of first n natural number is: " +sum);


        // for loop
        // for(int line=1; line<=4; line++){
        //     System.out.println("****");
        // }

        //Reverse of number
        // int n = 9122001;
        
        // while(n > 0) {
        //     int lastdigit = n % 10;
        //     System.out.print(lastdigit);
        //     n = n / 10;
        // }
        // System.out.println();

        //Reverse the given number
        // int n = 9122001;
        // int reverse = 0;

        // while(n > 0) {
        //     int lastdigit = n % 10;
        //     reverse = (reverse * 10) + lastdigit;
        //     n = n / 10;
        // }
        // System.out.println(reverse);

        //Do While Loop
        // int counter  = 1;
        // do {
        //     System.out.println("Hello World");
        //     counter++;
        // } while(counter <= 10);

        //Break Statement
        // for(int i=1; i<=5; i++){
        //     if( i == 3){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("I am out of loop");

        //Break Example
        // Scanner sc = new Scanner(System.in);

        // do {
        //     System.out.print("Enter your number: ");
        //     int n = sc.nextInt();
        //     if (n % 10 == 0){
        //         break;
        //     }
        //     System.out.println(n);
        // } while(true);

        //Continue Statement
        // for(int i=1; i<=5; i++) {
        //     if(i == 3) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        //Continue Statement Example
        // Scanner sc = new Scanner(System.in);
        // do {
        //     System.out.print("Enter Your Number: ");
        //     int n = sc.nextInt();

        //     if(n % 10 == 0){
        //         continue;
        //     }
        //     System.out.println("Number Was:- " + n);
        // } while(true);

        //Prime number or Not
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 2) {
            System.out.println("n is Prime");
        } else {
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n % i == 0) {  //n is a multiple of i (i is not equal to n)
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println("N is prime");
            } else {
                System.out.println("N is not prime");
            }
            }

        
    }
}