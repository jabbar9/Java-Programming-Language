public class pyramid {

    public static void pyramid(int n){        
        for(int i=1;i<=n; i++){ //Lines
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //Numbers
            int ch = 1;            
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch = ch + 2;                                
            }
            System.out.println();
        }        
}
        public static void main(String args[]){
        pyramid(5);
    }
}
