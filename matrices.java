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
        int matrix[][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        // spiralMatrix(matrix);

        //output of matrix 
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+ " ");
                }
                System.out.println();
            }            
            search(matrix,5);

        }        
    }
