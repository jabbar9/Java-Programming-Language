public class RecursionBasics {
    //print Number in decreasing Order
    public static void printDec(int n){
        if(n == 1){
            System.out.print(1);
            return;
        }
        System.out.print(n+ " ");
        printDec(n-1);
    }
    //print Number in Increasing Order
    public static void printInc(int n){
        if(n == 1){
            System.out.print(1+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
    //Print Sum of First N Natural Number
    public static int Sum(int n){
        if(n == 1){
            return 1;
        }
        int snm1 = Sum(n-1);
        int sum = n + snm1;
        return sum;
    }
    public static void main(String args[]){
        int n = 5;
        // printDec(n);
        // printInc(n);
        System.out.print(Sum(n));
    }
}
