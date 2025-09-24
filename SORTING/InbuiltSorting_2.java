package SORTING;
import java.util.Arrays;
import java.util.Collections;
public class InbuiltSorting_2 {
  //FUNCTION 1
  public static void printArr(Integer array []) {
    for (Integer i = 0;  i <array.length ;i++){
        System.out.print(array[i]+" ");
    }
    System.out.println();
   }
    public static void main(String[] args) {
        Integer array [] = {5 ,4 , 1 , 3, 2};
        Arrays.sort(array,Collections.reverseOrder()); //calling inbuilt functions
        printArr(array); //calling function 1

     Arrays.sort(array,0,4,Collections.reverseOrder()); //for using this comment out above lines
        printArr(array);
    }
}

