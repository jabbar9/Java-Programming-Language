public class ArrayAssignment {

    public static int firstQuestion(int nums[]){
        for(int i=0; i<nums.length; i++){
            int start = i;
            for(int j=i+1; j<nums.length; j++){
                int end = j;
                if(nums[start] == nums[end]){
                    System.out.println("true");
                }
            }
        }
        return -1;
    }

    public static boolean containsDuplicate(int[] nums){
      for(int i=0; i<nums.length; i++){
        for(int j=i+1; j<nums.length; j++){
            if(nums[i] == nums[j]){
                return true;
            }
        }
      }
      return false;
    }

    public static int reverseArray(int nums[], int target){
        int start = 0, end = nums.length-1;
        while( start <= end ){
            if(nums[start] == target){
                System.out.println(start);
            }
            start++;
        }
        return -1;
    }

    //Binary Search to find target in left to right boundary
    public static int search(int nums[], int left, int right, int target){
        int l = left;
        int r = right;

        while( l <= r){
            int mid = l + (r-1)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return -1;
    }

    
    public static void main(String args[]){
        // int nums[] = {1,2,3,1};
        // firstQuestion(nums);

        // int nums[] = {0,1,2,4,5,6,7};
        // reverseArray(nums, 4);

        int nums[] = {0,1,2,4,5,6,7};
    }
}

