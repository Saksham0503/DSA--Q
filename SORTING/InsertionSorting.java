package SORTING;
public class InsertionSorting {
    //FUNCTION 1
    public static void insertionSort (int array[]){
        for (int i = 0 ; i<array.length- 1 ; i++){
            int curr = array[i+1] ;
            int prev = i;
            
            while (prev>=0 && array[prev] > curr){
                //finding out correct position to insert 
                array[prev+1] = array[prev];        
                prev--;
            }
             //insertion
             array[prev+1] = curr;     
        }
    }
    
    //FUNCTION 2
    public static void printArr (int array[]){
        for( int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

 public static void main(String[] args) {
        int array []= {5, 4 , 1 , 3 , 2};
       insertionSort(array);  //calling the function 1
       printArr(array);  //calling  the function 2
        
    }
}