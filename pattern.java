public class pattern {
    public static void main(String args[]){
        //Print Star pattern 
        // for(int line=1; line<=4; line++){
        //     //one line
        //     for(int star=1; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Print Inverted Star Pattern
        // int n= 4;
        // for(int line=1; line<=n; line++){
        //     for(int star=1; star<=n-line+1; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Half Pyramid Pattern
        // int n= 4;
        // for(int line=1; line<=n; line++){
        //     for(int star=1; star<=line; star++){
        //         System.out.print(star);
        //     }
        //     System.out.println();
        // }

        //Character Pattern
        int n = 5;
        char ch = 'A';

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
