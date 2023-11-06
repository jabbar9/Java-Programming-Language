public class RecursionAssignment {
    //Question No.1
    public static void Occurence(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.println(i+ " ");
        }
        Occurence(arr, key, i+1);
    }
    //Question No.2
    public static  void printDigits(int n){
        String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        if(n == 0){
            return;
        }
        //Kaam
        int lastDigit = n%10;
        printDigits(n/10);
        System.out.print(digits[lastDigit]+ " ");
    }
    //Question No.3
    public static int length(String str){
        if(str.length() == 0){
            return 0;
        }
        return length(str.substring(1)) + 1;
    }
    public static void main(String args[]){
        // int arr[] = {3,2,4,5,6,2,7,2,2};
        // Occurence(arr, 2, 0);
        // System.out.println();

        //Question no.2
        // printDigits(2001);

        //Question no.3
        System.out.println(length("Abdul"));
    }
}
