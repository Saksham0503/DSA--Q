package ARRAYS;
public class Practice {
    public static void getMinMax(int[] arr) {
        // Code Here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0 ; i < arr.length-1 ; i++){
             if(arr[i] > max){
                 arr[i] = max;

             }
             
             if(arr[i] < min){
                 arr[i] = min;
             }
        }
        
        System.out.println(max+" "+min);
        
    }

    public static void main (String [] args){
        int arr1 [] = {1 , 345 , 234 , 21 , 56789};
        getMinMax(arr1);
        
        int arr2 [] = {56789};
        getMinMax(arr2);
        
    }
}