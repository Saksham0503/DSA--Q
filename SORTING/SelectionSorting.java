package SORTING;
public class SelectionSorting {
    //function 1
    public static void selectionSort(int array[]){
  for (int i = 0 ; i < array.length - 1 ; i++){
    int minPos = i;
    for (int j = i + 1 ; j < array.length;j++ ){
       if ( array[j]<array[minPos]){
           minPos= j;
       }
    }
    //swap
    int temp = array[minPos];
    array[minPos]=array[i];
    array[i]= temp;

  }
    }

    //FUNCTION 2
    public static void printArr(int array[]){
      for (int i =0 ; i < array.length ; i++){
        System.out.print(array[i]+" ");
      }
      System.out.println();
    }
    public static void main(String[] args) {
      int array[]  = {5, 4, 1 , 3 , 2} ;
      selectionSort(array);  //calling function 1
      printArr(array);   //calling function 2

    }


}