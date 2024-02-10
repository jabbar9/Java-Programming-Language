import java.util.*;
public class Arraylist {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    // public static int storeWater(ArrayList<Integer> height){
    //     int maxWater = 0;
    //     //Brute Force Approach
    //     for(int i=0; i<height.size(); i++){
    //         for(int j=i+1; j<height.size(); j++){
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int width = j-i;
    //             int currwater = ht * width;
    //             maxWater = Math.max(maxWater, currwater);
    //         }
    //     }
    //     return maxWater;
    // }

    //2 Pointers Approach
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp){
            //Calculate Water Area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currwater = ht * width;
            maxWater = Math.max(currwater, maxWater);
            //Update Pointer
            if(height.get(lp) < height.get(rp)){
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    //Pair Sum Problem With Brute Force Approach
    // public static boolean pairSum1(ArrayList<Integer> list, int target){
    //     for(int i=0; i<list.size(); i++){
    //         for(int j=0; j<list.size(); j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //2 Pointers Pair Sum Problem 
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp){
            //Case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            //Case 2
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int breakingPoint = -1;
        int n = list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                breakingPoint = i;
                break;
            }
        }

        int lp = breakingPoint+1;
        int rp = breakingPoint;
        while(lp != rp){
            //Case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            //Case 2
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1)%n;
            } else{
                //Case 3
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(6);
        // list.add(4,3);
        // System.out.println(list);

        //Get Element From an Array        
        // int element = list.get(2);
        // System.out.println(element);

        //Remove Element From Array
        // list.remove(3);
        // System.out.println(list);

        //Set Element at Index
        // list.set(2,100);
        // System.out.println(list);

        //Contains Element or Not
        // System.out.println(list.contains(10));
        // System.out.println(list.contains(100));

        //Size of an ArrayList
        // System.out.println(list.size());
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        //Reverse Print
        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+ " ");
        // }
        // System.out.println();

        //Print Maximum Using ArrayList
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++){
        //     if(max < list.get(i)){
        //         max = list.get(i);
        //     }
        // }
        // System.out.println("Maximum Element From an Array is:-" +max);

        //Swap 2 Numbers
        // int idx1 = 1, idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);

        //Sorting in ArrayList
        // System.out.println(list);
        // Collections.sort(list);  //Ascending Order
        // System.out.println(list);

        //Descending Order me Sorting
        // System.out.println(list);
        // Collections.sort(list, Collections.reverseOrder());  //Comparators - Function Logic
        // System.out.println(list);

        //Multi-Dimensional ArrayList
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1); list.add(2);
        // mainList.add(list);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3); list2.add(4);
        // mainList.add(list2);

        // //Printing Arraylists
        // for(int i=0; i<mainList.size(); i++){
        //     ArrayList<Integer> currList = mainList.get(i); //Its Gets the List Not the integer(1,2)
        //     for(int j=0; j<currList.size(); j++){
        //         System.out.print(currList.get(j)+ " ");
        //     }
        //     System.out.println();
        // }

        //Multi-dimensional ArrayList
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();

        // for(int i=1; i<=5; i++){
        //     list1.add(i*1);
        //     list2.add(i*2);
        //     list3.add(i*3);            
        // }
        // mainList.add(list1);
        // mainList.add(list2);
        // mainList.add(list3);

        // System.out.println(mainList);
        // for(int i=0; i<mainList.size(); i++){
        //     ArrayList<Integer> curList = mainList.get(i);
        //     for(int j=0; j<curList.size(); j++){
        //         System.out.print(curList.get(j)+ " ");
        //     }
        //     System.out.println();
        // }

        //Container with Most Water
        // ArrayList<Integer> height = new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        // System.out.println(storeWater(height));

        //Pair Sum -brute Force Approach
        //ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // int target = 5;
        // System.out.println(pairSum1(list, target));

        //Pair Sum With Some Arithmetic Modular Expression
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSum2(list, target));
    }
}
