import java.util.*;
public class function {
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int calculateSum(int number1, int number2){
        //Paramters or Formal Parameters
        int sum = number1 + number2;
        return sum;
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    public static int multiply(int a, int b){
        int product  = a * b;
        return product;
    }

    public static int factorial(int n){        
        int f = 1;

        for(int i=1; i<=n; i++){
            f = f * i;            
        }
        return f;  //Factorial of n
    }

    public static int binomialCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binomialCoeff = fact_n / (fact_r * fact_nmr);
        return binomialCoeff;
    }

    //function to calculate sum of 2 no.
    public static int sum(int a, int b){
        return a+b;
    }

    //function to calculate sum of 3 no.
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    // public static boolean isPrime(int n){
    //     //corner case
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2; i<=n-1; i++){
    //         if(n % i == 0){  //Completely Dividing
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){  //true
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
    
    public static void binToDecimal(int binNum){
        int myNum = binNum;
        int pow = 0;
        int dec = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum  = binNum/10;
        }
        System.out.println("Decimal of "+ myNum + " = " + dec);
    }

    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n > 0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary Form of "+myNum+ " = " +binNum);
    }

    public static void main(String args[]){        
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);  //Arguments or Actual Parameters
        // System.out.println(sum);

        // int a = 5;
        // int b = 10;
        // swap(a,b);

        // int a = 5;
        // int b = 10;
        // int prod = multiply(a, b);
        // System.out.println(prod);

        // System.out.println(factorial(4));

        // System.out.println(binomialCoeff(5, 2));

        // System.out.println(sum(10, 5, 15));
        // System.out.println(sum(10,5));

        // System.out.println(isPrime(12));

        // primesInRange(20);

        // binToDecimal(1111);

        decToBin(7);
    }
}