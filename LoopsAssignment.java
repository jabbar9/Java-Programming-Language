import java.util.Scanner;

public class LoopsAssignment {
    public static void main(String args[]){
        //Question no 1
        // for(int i=0; i<5; i++){
        //     System.out.println("Hello");
        //     i+=2;
        // }

        //Question no 2
        // Scanner sc = new Scanner(System.in);

        // int number;
        // int choice;
        // int evenSum=0;
        // int oddSum=0;

        // do{
        //     System.out.print("Enter any number");
        //     number = sc.nextInt();
        //     if(number % 2 ==0){
        //         evenSum+=number; //evenSum = evenSum + number
        //     } else {
        //         oddSum+=number; //oddSum = oddSum + number
        //     } 
        //     System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
        //     choice = sc.nextInt();
        // }while(choice==1);
        // System.out.println("Sum of even number: " +evenSum);
        // System.out.println("Sum of odd number: " +oddSum);

        //Question no 4
        //Question no 5
        Scanner sc = new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.print("Enter any positive integer:- ");
        num = sc.nextInt();

        for(int i=1; i<=num; i++){
            fact *= i;
        }
        System.out.println("Factorial:- " +fact);
    }
}
