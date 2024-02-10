public class RecursionBasicsNew {
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n + "");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n);        
    }

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;
    }
    public static int calcSum(int n){
        if(n == 1){
            return 1;
        }
        int snm1 = calcSum(n-1);
        int sn = n + snm1;
        return sn;
    }
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fibnm1 = fibonacci(n-1);
        int fibnm2 = fibonacci(n-2);
        int fibnm = fibnm1 + fibnm2;
        return fibnm;
    }
    public static boolean isSortrd(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i + 1]){
            return false;
        }
        return isSortrd(arr, i + 1);
    }
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

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

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n-1);
    }

    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSqr = halfPower * halfPower;

        //Check if the No. is Odd
        if(n%2 != 0){
            halfPowerSqr = a * halfPowerSqr;
        }
        return halfPowerSqr;
    }
    public static int tilingProblem(int n){ // 2 x n (Floor Size)
        //Base Case
        if(n == 0 || n == 1){
            return 1;
        }
        //Kaam
        //Vertical Choice
        int fnm1 = tilingProblem(n-1);

        //Horizontal Choice
        int fnm2 = tilingProblem(n-2);
        int totWays = fnm1 + fnm2;
        return totWays;
        // return tilingProblem(n-1) + tilingProblem(n-2);
    }
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        //Base Case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //Kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            //Duplicate
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static int friendspairing(int n){
        //Base Case
        if(n == 1 || n == 2){
            return n;
        }
        //Choice
        //Single
        int fnm1 = friendspairing(n-1);

        //Pairs
        int fnm2 = friendspairing(n-2);
        int pairWays = (n-1) * fnm2;

        //Total Ways
        int totWays = fnm1 + pairWays;
        return totWays;
        //return friendspairing(n-1) + (n-1) * friendspairing(n-2);
    }
    public static void printBinStrings(int n, int lastPlace, String str){
        //Base Case
        if(n == 0){
            System.out.println(str);
            return;
        }
        //Kaam
        printBinStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        // int n = 5;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(calcSum(n));
        // System.out.println(fibonacci(n));
        //Check if the array is Sorted or not
        // int arr[] = {1,2,3,4,5};
        // System.out.println(isSortrd(arr, 0));
        //Check the First Occurence of Key
        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(firstOccurence(arr, 5, 0));
        //Check Last Occurence of Key
        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(lastOccurence(arr, 5, 0));
        //Print X to the Power N
        // System.out.println(power(2, 10));
        //Print X to the Power N in an Optimized Way
        // int a = 2;
        // int n = 10;
        // System.out.println(optimizedPower(a, n));
        //Tiling Problem
        // System.out.println(tilingProblem(4));
        //Removes Duplicates From String
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        //Friends Pairing Problem
        // System.out.println(friendspairing(3));
        //Binary String Problem
        // printBinStrings(3, 0, "");
    }
}
