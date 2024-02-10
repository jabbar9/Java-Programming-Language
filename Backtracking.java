public class Backtracking {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void changeArr(int arr[], int i, int val){
        //Base Case
        if(i == arr.length){
            printArr(arr);
            return;
        }
        //Recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1); //Function Call Step
        arr[i] = arr[i] - 2;  //backtracking Step
    }
    public static void findSubsets(String str, String ans, int i){{
        //Base Case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        //Yes Choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //No Choice
        findSubsets(str, ans, i+1);
    }    
    }
    public static void findPermutation(String str, String ans){
        //Base Case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //Recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            //"abcde" ==> "ab" + "de" = "abde"
            String newStr = str.substring(0,i) + str.substring(i+1);
            findPermutation(newStr, ans+curr);
        }
    }
    public static int gridCount(int i, int j, int n, int m){
        //Base Case
        if(i == n-1 && j == m-1){  //Condition For Last Cell
            return 1;
        } else if(i == n || j == m){  //Boundary Cross Condition
            return 0;
        }
        //Recursion
        int w1 = gridCount(i+1, j, n, m);
        int w2 = gridCount(i, j+1, n, m);
        return w1 + w2;
    }
    public static void main(String[] args){
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);

        //Find all Subsets
        // String str = "abc";
        // findSubsets(str, "", 0);

        //Find Permutation Combination
        // String str = "abc";
        // findPermutation(str,"");

        //Finding Grid Ways
        int n = 3, m = 3;
        System.out.println(gridCount(0,0,n,m));
    }
}
