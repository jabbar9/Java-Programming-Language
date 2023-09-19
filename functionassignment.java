import java.util.*;
public class functionassignment {
    //Compute the average of three numbers
    public static int average(int num1, int num2, int num3){
        int total = (num1 + num2 + num3) / 3;
        return total;
    }

    //Method to check the argument is even or not
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static int sum(int number){
        int sum = 0;
        
        while(number > 0){
        int lastDigit = number % 10;
        sum = sum + lastDigit;

        number=number/10;
        }
        return sum;
    }

    //palindrome number 
    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if(number == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //First Questions Solution
        // System.out.print("Enter First Number:- ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter Second Number:- ");
        // int num2 = sc.nextInt();
        // System.out.print("Enter Third Number:- ");
        // int num3 = sc.nextInt();
        // System.out.println(average(num1,num2,num3));

        //Check if the number is Even or not
        // System.out.print("Enter Positive Number:- ");
        // int num1 = sc.nextInt();

        // if(isEven(num1)){
        //     System.out.println("Number is Even");
        // } else {
        //     System.out.println("Number is Odd");
        // }

        //Question no. 5
        // System.out.println(sum(12344));

        //Question no 4.
        System.out.println("Please Enter a number:- ");
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("Number "+palindrome+ " is a palindrome");            
        } else {
            System.out.println("Number is "+palindrome+ " Not a palindrome");
        }
    }
}
