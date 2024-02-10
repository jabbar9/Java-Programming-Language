public class DivideNCNew {
    public static void mergeSort(int arr[], int si, int ei){
        //Base Case
        if(si >= ei){
            return;
        }
        //Kaam
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid); //Left part
        mergeSort(arr, mid+1, ei); //Right Part
        
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //Left Iterator
        int j = mid+1; //Right Iterator
        int k = 0;
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;            
        }

        //For Leftover Elements of 1st Sorted Parts
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        //For Rightover Elements of 2nd Sorted Parts
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //Copy temp to Original Array
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    //Quick Sort
    public static void quickSort(int arr[], int si, int ei){
        //Base Case
        if(si >= ei){
            return;
        }
        //Last Element
        int pIdx = partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);  //Left Part
        quickSort(arr, pIdx+1, ei);  //Right Part
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; //To make place for Elements Smaller than Pivot

        for(int j=si; j<ei; j++){
            if(arr[j] < pivot){
                i++;
                //Swap Afterwards
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }            
        }
        i++;
        //Swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    //Sorted & Rotated Search
    public static int seach(int arr[], int target, int si, int ei){
        //Kaam
        int mid = si + (ei-si) / 2;

        //Case Found
        if(arr[mid] == target){
            return mid;
        }

        //Mid on L1
        if(arr[si]<= arr[mid]){
            //Case a:Left
            if(arr[si] <= target && target <= arr[mid]){
                return seach(arr, target, si, mid-1);
            } else {
                //Case b:Right
                return seach(arr, target, mid+1, ei);
            }
        }

        //Mid on L2
        else{
            //Case c:Right
            if(arr[mid] <= target && target <= arr[ei]){
                return seach(arr, target, mid+1, ei);
            } else{
                return seach(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        // int arr[] = {6,3,9,5,2,8};
        // mergeSort(arr, 0, arr.length-1);
        // printArr(arr);
        // quickSort(arr, 0, arr.length-1);
        // printArr(arr);
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0; //Expected output=4
        int tarIdx = seach(arr,target,0,arr.length-1);
        System.out.println(tarIdx);
    }
}
