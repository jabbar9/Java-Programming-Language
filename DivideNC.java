public class DivideNC {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    //Merge Sort 
    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid); //Divides the left part
        mergeSort(arr, mid+1, ei); //Divides the right part 
        merge(arr,si, mid, ei);
    }
    //Merge Sort Begins
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //Iterator for Left Part
        int j = mid+1; //Iterator for right part
        int k = 0;
        while(i <= mid && j<= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //Left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //Right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //Copy temp array to original array
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    //Quick Sort Begins
    public static void quickSort(int arr[], int si, int ei){
        //Base Case
        if( si >= ei){
            return;
        }
        //IMP Work to be done
        int pIdx = partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);  // Divides the right part of the array
        quickSort(arr, pIdx+1, ei);  // Divides the right part of the array
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; //To make place for elements smaller than array

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                //Swap the values in original array only
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }                        
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; // pivot = arr[i]; xxxxx ye nahi karna
        arr[i] = temp;
        return i;
    }
    //Search in Rotated Sorted Array
    public static int search(int arr[], int tar, int si,int ei){
        //Base Case
        if( si > ei){
            return -1;
        }
        //Actual Work
        int mid = si + (ei - si) / 2;

        //Case Found
        if(arr[mid] == tar){
            return mid;
        }

        //Mid on L1
        if(arr[si] <= arr[mid]){
            //Case a: Left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            } else{
                return search(arr, tar, mid+1, ei);
            }
        }

        //Mid on L2
        else {
            //Case c: Right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            } else {
                //Case d: Right
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String args[]){
        //Merge Sort Code
        // int arr[] = {6,3,9,5,2,8};
        // mergeSort(arr, 0, arr.length-1);
        // printArr(arr);

        //Quick Sort Code
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);

        //Search in Rotated Sorted Array
        // int arr[] = {4,5,6,7,0,1,2};
        // int target = 0;  //Output  --> 4
        // int Idx = search(arr, target, 0, arr.length-1);
        // System.out.println(Idx);
    }
}
