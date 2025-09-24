package SORTING;
public class CH14_Questions {
    
    //question 1 
    //Bubble Sort
    public static void bubbleSort (int arr[]){

        for (int i = 0 ; i < arr.length ; i++){

            for (int j = i+1 ; j < arr.length ; j++){
                 
                if (arr[i] < arr[j]){ //take the smallest element to last
                    int temp = arr[i];
                    arr[i] = arr [j];
                    arr[j] = temp ;
                }
            }
        }
    }

    public static void print (int arr[]){

        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Selection Sort
    public static void selectionSort (int arr[]){
      
    }

    //Insertion Sort

    //Counting Sort
    public static void main(String[] args) {
        
        int arr [] = { 3, 6 ,2 , 1, 8 , 7 , 4 , 5, 3 , 1};

        bubbleSort(arr); //function 1 
        print(arr);


     }
}