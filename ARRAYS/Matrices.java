package ARRAYS;
import java.util.*;

public class Matrices{

    //function 1 -->> TO FIND THE KEY 
    public static boolean sortKey(int matrix [][] , int key){
        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[0].length ; j++){

                if (matrix [i][j] == key){
                    System.out.println("KEY IS FOUND AT : " + i +" ,"+ j);
                    return true;
                }
            }
        }
        System.out.println(" KEY IS NOT FOUND ");
        return false ;
    }
    
    //function 2 -->> TO FIND THE SMALLEST NUMBER 
    public static void smallInArray (int matrix [][] ){
        int small = Integer.MAX_VALUE; // + infinity

        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[0].length ; j++){

                if (matrix[i][j] < small){
                    small = matrix[i][j];
                }
            }
        }
        System.out.println("the smallest number is : "+ small);
    }
    public static void main(String[] args) {

        int matrix [][] = new int [3][3];
        int n = matrix.length;       //rows
        int m = matrix[0].length;    //columns
        
        int key = 5;
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){

                matrix[i][j] = sc.nextInt();
            }
        }

        

        //output
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        sortKey(matrix,key);       //calling function 1 
        smallInArray(matrix);      //calling function 2
    }

}