// import java.util.*;
public class ArrayCC {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 2;            
        }        
    }
    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE; //-infinity means it alligns minimum possible number
        int smallest = Integer.MAX_VALUE; //+infinity means it alligns maximum possible  number
        for(int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("Smallest value is:- "+smallest);
        return largest;
    }

    public static int binarysearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while( start<=end ) {
            int mid = ( start + end) / 2;
            if(numbers[mid] == key){ //found - directly certer
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length-1;

        while( first <= last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void printPairs(int numbers[]){
        int tp = 0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs:- "+tp);
    }

    public static void subArrays(int numbers[]){
        int ts = 0;        
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){ //Print
                    System.out.print(numbers[k]+ " ");  //Subarray                    
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays:- "+ts);        
    }

    public static void maxSubArrays(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    //Sub Arrays ka Sum nikalna hai
                    currSum += numbers[k];                    
                }
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum:- "+ maxSum);
    }

    public static void prefixArraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //Calculate Prefix Array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];
                
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum:- "+ maxSum);
    }

    public static void kadanes(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our Maximum Sub array sum is:-" +ms);
    }

    public static int buyAndSellStocks(int prices[]){
        int buyPrices = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrices < prices[i]){  //profit
                int profit = prices[i] - buyPrices; //Todays Profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrices = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
    //     int marks[] = {97,98,99};
    //     update(marks);

    //     for(int i=0; i<marks.length; i++){
    //         System.out.print(marks[i]+" ");
    //     }
    //     System.out.println();

    //Linear Search
    // int numbers[] = {2,4,1,10,5,8,5,7};
    // int key = 10;

    // int index = linearSearch(numbers, key);
    // if(index == -1){
    //     System.out.println("Key Not Found");
    // } else {
    //     System.out.println("Key Found at index:- "+index);
    // }
    
    //Largest Number in a given Array
    // int number[] = {1,2,6,3,5};
    // System.out.println("Largest Value is:-" +getLargest(number));

    //Binary Search Array
    // int numbers[] = {2,4,6,8,10,12,14};
    // int key = 10;

    // System.out.println("Index for Key is:-" +binarysearch(numbers, key));

    //Reverse an Array
    // int numbers[] = {2,4,6,8,10};
    // reverse(numbers);

    // //Print
    // for(int i=0; i<numbers.length; i++){
    //     System.out.print(numbers[i]+ " ");
    // }
    // System.out.println();

    //Print pairs From an Array
    // int numbers[] = {2,4,6,8,10};
    // printPairs(numbers);

    //Print Sub Arrays
    // int numbers[] = {2,4,6,8,10};
    // subArrays(numbers);

    //Print Maximum Value from all sub array value using Brute Force Method
    // int numbers[] = {1-2,6,-1,3};
    // maxSubArrays(numbers);
    
    //Print Maximum Value from all sub array value using Prefix Sum Method
    // int numbers[] = {1-2,6,-1,3};
    // prefixArraySum(numbers);

    //Print Maximum Sub array using kadanes method
    // int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
    // kadanes(numbers);

    //Buy and Sell Stocks using Arrays
    int prices[] = {7,1,5,3,6,4};
    System.out.println(buyAndSellStocks(prices));
    }
}

//https://www.cloudskillsboost.google/public_profiles/5c5c3a68-434a-4fb8-87b7-261da9c34b6an