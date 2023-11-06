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
    //Print Factorial of a Number
    public static int fact(int n){
        if(n == 0){
            return 1;            
        }
        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;
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
    //Print Nth Fibonaci Series
    public static int Fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = Fibonacci(n-1);
        int fnm2 = Fibonacci(n-2);
        int fibn = fnm1 + fnm2;
        return fibn;
    }
    //Check if the Array is Sorted or not
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    //Find the First Occurence of Key in a Given Array
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    //Find the Last Occurence of Key in a Given Array
    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    //Print X to the Power N
    public static int Power(int x, int n){
        if( n == 0){
            return 1;
        }
        int xnm1 = Power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
    //Print X to the power N Optimized Way
    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSqr = halfPower * halfPower;

        //N is Odd
        if(n % 2 != 0){
            halfPowerSqr = a * halfPowerSqr;
        }
        return halfPowerSqr;
    }
    //Tiling Problem
    public static int tilingProblem(int n){
        //Base Case
        if(n == 0 || n == 1){
            return 1;
        }
        //Kaam
        //Vertical Choice
        int fnm1 = tilingProblem(n-1);

        //Horizontal Problem
        int fnm2 = tilingProblem(n-2);
        int totWays = fnm1 + fnm2;
        return totWays;

        // return tilingProblem(n-1) + tilingProblem(n-2);
    }
    //Remove Duplicates from String
    public static void removeDuplicates(String str, int idx, StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']== true ){
            //Duplicate
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    //Friends Pairing Problem
    public static int friendspairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        //Choices
        //Single
        int fnm1 = friendspairing(n-1);

        //Pairs
        int fnm2 = friendspairing(n-2);
        int pairWays = (n-1) * fnm2;
        
        //Total Ways
        int totWays = fnm1 + pairWays;
        return totWays;

        // return friendspairing(n-1) + (n-1) * friendspairing(n-2);
    }
    //Binary String Problem
    public static void printBinStrings(int n, int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        //Kaaam
        printBinStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        // int n = 25;
        // int arr[] = {1,2,3,4};
        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // int a = 2, b = 10;
        // String str = "appnacollege";

        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.print(Sum(n));
        // System.out.println(Fibonacci(n));
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastOccurence(arr, 5, 0));
        // System.out.println(Power(2,10));
        // System.out.println(optimizedPower(a, b));
        // System.out.println(tilingProblem(4));
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friendspairing(3));
        printBinStrings(3, 0, "");
    }
}
