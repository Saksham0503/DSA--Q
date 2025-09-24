package ARRAYS;
public class Array_BinarySearch {
    //function 1
    public static int binarySearch (int numbers [], int key){
       int start = 0 , end = numbers.length-1 ;
       while (start<= end){
        int mid = (start+end)/2;
        //comparisons
        if (numbers[mid]==key){
            return mid;
        }
        if (numbers[mid] < key){ //2nd half mein search
            start = mid + 1 ; 
        }
        if (numbers[mid] > key){ //1st half mein search
            end = mid - 1 ;
        }
       }
       return -1;
    }
    
    //function 2
    public static void reverseArray(int numbers []){
           int start = 0, end = numbers.length - 1;
           //swap
           while(start < end){
           int temp = numbers [end];
           numbers [end ] = numbers [start];
           numbers [start] = temp;

           start++;
           end--;
           }
    }



    
    public static void main(String[] args) {
        int numbers  [] = {2 , 4 , 6 , 8 , 10 , 12 , 14};
        int key = 10;
        System.out.println("the index of key is --> "+ binarySearch(numbers, key)); //calling the function 1
    
        //reversing an array
        reverseArray(numbers); //calling function 2
        for (int i =0;i < numbers.length ;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }

}
