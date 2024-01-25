import java.util.*;
public class matrices{
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at cell (" +i+ " " +j+ ")" );
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    //Spiral matrix Code
    public static void spiralMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while( startRow <= endRow && startCol <= endCol){
            //Top boundary
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //Right Boundary
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //Botttom Boundary
            for(int j=endCol-1; j>=startCol; j--){
                if( startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //Left Boundary
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         //Primary diagonal
        //         if(i == j){
        //             sum += matrix[i][j];
        //         } else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        //Linear approach with limited time and space complexity
        for(int i=0; i<matrix.length; i++){
            //primary Diagonal
            sum += matrix[i][i];

            //Secondary Diagonal
            sum += matrix[i][matrix.length-i-1];
        }
        return sum;
    }

    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Key Found at (" +row+ "," +col+ ")");
            } else if(key < matrix[row][col]){
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key Not Found");
        return false;
    }
    
    public static void main(String args[]){
        // int matrix[][] = new int[3][3];
        // int n = matrix.length, m = matrix[0].length;        
        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }


        // //output        
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(matrix[i][j]+ " ");
        //         }
        //         System.out.println();
        //     }            
        //     search(matrix,5);

        //Spiral Matrix Code
        // int matrix[][] = {{1,2,3,4},
        //                     {5,6,7,8},
        //                     {9,10,11,12},
        //                     {13,14,15,16}};
        // spiralMatrix(matrix);

        //Diagonal Sum
        // int matrix[][] = {{1,2,3,4},
        //                     {5,6,7,8},
        //                     {9,10,11,12},
        //                     {13,14,15,16}};
        // System.out.println(diagonalSum(matrix));

        //Search a Key in Sorted Matrix
        int matrix[][] = {{10,20,30,40},
        {15,25,35,45},
        {27,29,37,48},
        {32,33,39,50}};
        int key = 33;
        staircaseSearch(matrix,key);
        }        
    }
// int row = 0, col = matrix[0].length-1;

//         while( row<=matrix.length && col>=0){
//             if(matrix[row][col] == key){
//                 System.out.println("Found Key at ( "+row+ ","+col+ " )");
//                 return true;                
//             } else if(key<matrix[row][col]){
//                 col--;
//             } else {
//                 row++;
//             }
//         }
//         System.out.println("Key not found");
//         return false;