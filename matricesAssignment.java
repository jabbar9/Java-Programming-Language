public class matricesAssignment {

    //Searching in Sorted matrix from Bottom to top
    public static boolean staircaseSearch(int matrix[][], int key){
        int row = matrix[0].length-1, col = 0;
        while(row>=0 && col<=matrix.length){
            if(matrix[row][col]==key){
                System.out.println("Key Found at index ("+row+ ","+col+ ")");
                return true;
            }
            else if(key<matrix[row][col]){
                row--;
            } else{
                col++;
            }
        }
        System.out.println("Key not found ");
        return false;
    }

    //Assignment question 1
    public static int findSevenCount(int matrix[][],int key){
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0;j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    count++;
                }
            }
        }
        return count;
    }

    //Assignment question 2
    public static int secondRowSum(int matrix[][]){
        int sum = 0;
        //2nd Row sum 
        for(int j=0; j<matrix[0].length; j++){
            sum += matrix[1][j];
        }
        return sum;
    }

    //Assignment question 3
    public static void printMatrix(int matrix[][]){
        System.out.println("The Matrix is: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        //Homework Question
        // int matrix[][] = {{10,20,30,40},
        // {15,25,35,45},
        // {27,29,37,48},
        // {32,33,39,50}};
        // int key = 35;
        // staircaseSearch(matrix,key);

        //Assignment Question no 1
        // int matrix[][] = {{4,7,8},
        // {8,8,7}};
        // int key = 7;
        // System.out.println(findSevenCount(matrix, key));

        //Assignment Question no 2
        // int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        // System.out.println(secondRowSum(nums));

        //Assignment question 3
        int row = 2, col = 3;
        int[][] matrix= {{2,3,7},{5,6,7}};

        //Display original matrix
        printMatrix(matrix);

        //Transpose the matrix
        int [][] transpose = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        //Print Transpose
        printMatrix(transpose);
    }
}
