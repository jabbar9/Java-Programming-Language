public class patternAdvance {

    public static void hollow_rectangle(int totRows, int totCols){
        //outer loop
        for (int i=1; i<=totRows; i++) {
            //inner- columns
            for(int j=1; j<=totCols; j++){
                //Cell - (i,j)
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    //Boundary Condition
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotatedHalfPyramid(int n){
        //outer
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        
    }

    public static void inverted_half_pyramid_withNumber(int n){
        for(int i=1; i<=n; i++){
            //inner-number
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n){
        int counter = 1;
        //Outer Loop
        for(int i=1; i<=n; i++){
            //Inner-How many times will counter be printed
            for(int j=1; j<=i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        //1st Half
        for(int i=1; i<=n; i++){
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces - j 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd Half
        for(int i=n; i>=1; i--){
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces - j 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            //Spaces

            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //Hollow rectangle - Stars
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        //1st half
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //Stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for(int i=n; i>=1; i--){
            //Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //Stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

public static void main(String args[]){
        // hollow_rectangle(4,5);
        // inverted_rotatedHalfPyramid(7);
        // inverted_half_pyramid_withNumber(5);
        // floyds_triangle(5);
        // zero_one_triangle(5);
        // butterfly(5);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        diamond(5);
    }
}
