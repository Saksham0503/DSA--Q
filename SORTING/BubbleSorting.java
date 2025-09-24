package SORTING;
public class BubbleSorting {
    //FUNCTION 1
    public static void bubbleSort (int array[]){
        for (int turn = 0 ; turn < array.length - 1 ; turn ++){  //total turns = 4
            for (int i = 0 ; i < array.length-1 -turn; i++){     //no. of swap steps in each turn
                if (array[i]>array[i+1]){
                //swap
                int temp = array[i];
                array[i]= array[i+1];
                array[i+1] = temp ;
                }
            }
        }
        
    }
    
    //FUNCTION 2
    public static void printArray (int array[]){
        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int unsortedArray [ ] = {5, 4 , 1 , 3 , 2};
        bubbleSort(unsortedArray);//calling function 1
        printArray(unsortedArray);//calling function 1
    }
}