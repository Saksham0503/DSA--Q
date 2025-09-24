package ARRAYS;
import java.util.Scanner;
public class Array_Linear_Search {
    //function 1
    public static void update (int marks []){
      for (int i = 0 ; i < marks.length ; i++){
         marks [i] = marks[i] + 1;
      }
    }

    //function 2
    public static int linearSearch (int numbers [], int key){
      for (int i = 0; i < numbers.length ;i++){
        if (key==numbers[i]){
          return i ;

        }
      }
      return -1;
    }

     //function 3
public static void searchLargest(int number []){
      int large = Integer.MIN_VALUE; // -infinity

      for(int i = 0; i < number.length ;i++){
        if (number [i] >= large){
          large = number [i];
        }
          
        }
        System.out.println("THE LARGEST NUMBER IS --> "+ large);
      }
     //function 4
     public static int searchSmallest (int number []){
      int small = Integer.MAX_VALUE; // +infinity

      for (int i = 0 ; i < number.length ; i++){
        if (number[i] <= small){
          small = number[i];
        }
      }
      return small;
     }
   public static void main(String[] args) {
    int marks [] ={223, 45 , 46, 78};
    update(marks);  //calling the function 1

    //loop
    for(int i =0; i<marks.length ; i++){
        System.out.print("marks --> "+ marks[i]+" ");
    }
    System.out.println();

    //
    int numbers [] = {23, 56, 78, 10 , 45 , 29};
    int key = 10;
    int index = linearSearch(numbers , key); //calling the function 2
    if (index == -1){
      System.out.println("no index is found ");
    }else{
      System.out.println("index is --> "+ index); 
     }

     //
     int number [] ={2 , 3 , 1, 6 , 5};
     searchLargest(number); //calling function 3
     int req_no =searchSmallest(number); //calling function 4
     System.out.println("THE SMALLEST NUMBER IS --> "+ req_no);
   }
}

