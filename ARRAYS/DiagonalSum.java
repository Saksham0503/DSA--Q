package ARRAYS;
public class DiagonalSum {

    //FUNCTION 1 
    public static void diagonalSum (int matrix [][]) {  // time complexity --> O(n^2)

        int sum = 0 ;

        for ( int i = 0 ; i < matrix.length ; i++){

            for (int j = 0; j < matrix[0].length ; j++){

                  if (i == j || i+j == matrix.length -1){                  
                      sum = matrix[i][j] + sum ;
                  } 
            }
        }
        System.out.println("DIAGONAL SUM IS : " + sum);
    }

    //FUNCTION 2 
    public static void diagonalSumOptimized (int matrix[][]){ // time complexity --> O(n)

        int sum = 0 ;

        for ( int i = 0; i < matrix.length ; i++){

          //primary diagonal sum
          sum = sum + matrix[i][i] ;

          //secondary diagonal sum
          if ( i != matrix.length - 1 -i) {
             sum = sum + matrix[i][matrix.length - 1 -i] ;
          }
         
        }
        System.out.println("DIAGONAl sum is :" + sum);
    }
    public static void main(String[] args) {
        int matrix [][] = {{1 , 2 , 3 , 4}
                        , { 5 , 6 ,7 ,8},
                          {9 , 10 ,11 ,12},
                          {13 , 14 ,15 ,16}};

      diagonalSum(matrix);       //calling a function
      diagonalSumOptimized(matrix) ;  //calling a function 
    }
}
