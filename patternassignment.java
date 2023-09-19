public class patternassignment {
    public static void main(String args[]){
        //Inverted Half pyramid with numbers pattern
        // int n = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //Floyds Triangle Pattern
        int n = 4;
        int counter = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    
}
