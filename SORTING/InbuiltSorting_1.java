package SORTING;
import java.util.Arrays ;
public class InbuiltSorting_1 {
    //FUNCTION 1
    public static void printArr (int array[]){
    for (int i =0; i < array.length ;i++){
       System.out.print(array[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
     int unsorted []= {5 , 4 ,1 , 3, 2}; 
     
     Arrays.sort(unsorted); //calling inbuilt function
     printArr(unsorted);//calling function 1

     Arrays.sort(unsorted,0,3);  // for using this comment out above inbuilt function
     printArr(unsorted);
    }
}
