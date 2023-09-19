public class largest {
    public static int largest(int number[]){
        int  large=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(large<number[i]){
                large=number[i];
               return large;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={3,5,7,8,4,9,2};
        System.out.print(largest(number));
    }
}
