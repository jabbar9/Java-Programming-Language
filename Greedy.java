import java.util.*;
public class Greedy {
    static class Job {
        int deadline;
        int profit;
        int id;
        public Job(int i,int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args){
        //Activity Selection Code
        // int start[] = {1,3,0,5,8,5};
        // int end[] = {2,4,6,7,9,9};

        // //Sorting if starting array is sorted and not ending array
        // int activities[][] = new int[start.length][3];
        // for(int i=0; i<start.length; i++){
        //     activities[i][0] = i;
        //     activities[i][1] = start[i];
        //     activities[i][2] = end[i];
        // }

        // //lambda Functionn -> ShortForm of a Big Function
        // //Only Sorts End Array Not Start Array
        // Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // //End time basis sorted activities
        // int maxAct = 0;
        // ArrayList<Integer> ans = new ArrayList<>();

        // //1st Activity
        // maxAct = 1;
        // ans.add(activities[0][0]); //By default first activity is included which is "0"
        // int lastEnd = activities[0][2];  //End Arrays 1st Value
        // for(int i=1; i<end.length; i++){
        //     if(activities[i][1] >= lastEnd){
        //         //Activity Select
        //         maxAct++;
        //         ans.add(activities[i][0]);
        //         lastEnd = activities[i][2];
        //     }
        // }
        
        // System.out.println("Max Activities = "+maxAct);
        // for(int i=0; i<ans.size(); i++){
        //     System.out.print("A" +ans.get(i)+ " ");
        // }
        // System.out.println();

        //Fractoinal Knapsack
        // int val[] = {60,100,120};
        // int weight[] = {10,20,30};
        // int W = 50;

        // double ratio[][] = new double[val.length][2];
        // //0th col => idx 1st col => ratio
        // for(int i=0; i<val.length; i++){
        //     ratio[i][0] = i;
        //     ratio[i][1] = val[i]/(double)weight[i];
        // }

        // //Ascending Order
        // Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        // int capacity = W;
        // int finalVal = 0;
        // for(int i=ratio.length-1; i>=0; i--){
        //     int idx = (int)ratio[i][0];
        //     if(capacity >= weight[idx]){ //Include Full Items
        //         finalVal += val[idx];
        //         capacity -= weight[idx];
        //     } else {
        //         //Include Fractional Items
        //         finalVal += (ratio[i][1] * capacity);
        //         capacity = 0;
        //         break;
        //     }
        // }
        // System.out.println("Final Value:- "+finalVal);

        //Minimum Absolute Difference
        // int A[] = {1,2,3};
        // int B[] = {2,1,3};

        // Arrays.sort(A);
        // Arrays.sort(B);

        // int minDiff = 0;
        // for(int i=0; i<A.length; i++){
        //     minDiff += Math.abs(A[i]-B[i]);
        // }
        // System.out.println("Absolute Difference is:-" +minDiff);

        //Maximum Length Chain Pairs
        // int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        // Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        // int chainLen = 1;
        // int chainEnd = pairs[0][1]; //Last Selected Pair End //Chain End
        // for(int i=0; i<pairs.length; i++){
        //     if(pairs[i][0] > chainEnd){
        //         chainLen++;
        //         chainEnd = pairs[i][1];
        //     }
        // }
        // System.out.println("Max Length of Chain:-"+chainLen);

        //Indian Coins
        // Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        // Arrays.sort(coins, Comparator.reverseOrder());

        // int countOfCoins = 0;
        // int amount = 590;
        // ArrayList<Integer> ans = new ArrayList<>();

        // for(int i=0; i<coins.length; i++){
        //     if(coins[i] <= amount){
        //         while(coins[i] <= amount){
        //             countOfCoins++;
        //             ans.add(coins[i]);
        //             amount -= coins[i];
        //         }
        //     }
        // }
        // System.out.println("Total Minimum Coins Used:-" +countOfCoins);

        // for(int i=0; i<ans.size(); i++){
        //     System.out.println(ans.get(i)+ " ");
        // }
        // System.out.println();

        //Job Sequencing Problem
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit-obj1.profit);
        /*Descending Order of sorting because of obj2.profit-obj1.profit if it was reverse than
         it would sort in an ascending order
        */

        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        //Print Seq
        System.out.println("Max Jobs:- " +seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i)+ " ");
        }
        System.out.println();
    }
}