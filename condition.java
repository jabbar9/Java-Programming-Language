import java.util.Scanner;

public class condition {
    public static void main(String args[]){
        //Sum of First N Natural Number
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while(i <= n){
        //     sum += i;
        //     i++;
        // }
        // System.out.println(sum);

        //Print Reverse of a number
        // int n = 10899;
        //  while(n > 0){
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit);
        //     n = n / 10;
        //  }
        //  System.out.println();

        //Reverse the Given Number
        // int n = 10899;
        // int rev = 0;

        // while(n > 0){
        //     int lastDigit = n % 10;
        //     rev = (rev * 10) + lastDigit;
        //     n /=10;            
        // }
        // System.out.println(rev);

        //Check if a number is prime or not
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2){
            System.out.println("N is Prime");
        } else {
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n % i ==0){ //n is a multiple of i (i not equal to 1 or n)
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println("N is Prime");
            } else {
                System.out.println("N is not a Prime");
            }
            }
    }
}
