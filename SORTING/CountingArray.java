package SORTING;
public class CountingArray {
    //FUNCTION 1
    public static void countSort (int array[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0 ; i<array.length ;i++){
             largest = Math.max(largest, array[i]);  //gives the max value
        }

        //frequency
        int count []= new int[largest+1]; 
        for (int i = 0; i<array.length;i++){
           count[array[i]]++;
        }

        //sorting
        int j = 0;
        for (int i =0 ;i<count.length ;i++){
            while (count[i]>0){
                array[j]=i;
                j++;
                count[i]--;
            }

        }
    }

    //FUNCTION 2
    public static void printArr (int array[]){
        for (int i =0 ; i < array.length ;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr [] = {1, 4 , 1, 3 , 2 , 4 , 3 , 7};
        countSort(arr);    //calling counting sort , function 1
        printArr(arr);     //calling function 2
    }
}
