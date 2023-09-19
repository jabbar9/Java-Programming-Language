import java.util.Scanner;

public class conditionAssignment {
    public static void main(String args[]){
        //Wuestion no 2
        // Scanner sc = new Scanner(System.in);
        // int choice;
        // int number;
        // int evenSum = 0;
        // int oddSum = 0;

        // do{            
        //     System.out.print("Enter any number:- ");
        //     number = sc.nextInt();

        //     if(number % 2 ==0){
        //         evenSum += number;
        //     } else {
        //         oddSum += number;
        //     }
        //     System.out.println("Do you want to continue? Press 1 for yes 0 for no");
        //     choice = sc.nextInt();
        // } while(choice==1);

        // System.out.println("Sum of Even Number:- " +evenSum);
        // System.out.println("Sum of Odd Number:- " +oddSum);

        printMultiplicationTable(5);
    }

    //Question no 4
    public static void printMultiplicationTable(int number) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any Number:-");
            int n = sc.nextInt();
            for(int i=1; i<=10; i++){
                System.out.println(n + " * " +i+ " = " + n*i);
            }
        }
}
