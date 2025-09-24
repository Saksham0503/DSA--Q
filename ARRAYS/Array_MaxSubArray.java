package ARRAYS;
public class Array_MaxSubArray {
    //function 1 -->> BRUTE FORCE
    public static void maxSubarray(int array []){
        int currentSum = 0;
        int maxvalue =Integer.MIN_VALUE ;  //min value is --> -infinity
    
    for (int start = 0; start < array.length ; start ++){
        //inner loop 1
        for(int end = start ; end < array.length ; end ++){
            //inner loop 2
            currentSum  = 0;
            for (int i = start; i <= end ; i++){//print

                 currentSum += array[i];  //subarray sum
            }
            System.out.println( currentSum);
            if (currentSum > maxvalue){
                maxvalue = currentSum ;
            }
        }
    }
    System.out.println("MAX SUM IS --> " + maxvalue);
 }


   //function 2 -->> PREFIX SUM
public static void maxSubarrayPrefix(int array []){
    int maxValue = Integer.MIN_VALUE ; //MIN VALUE IS -infinity
    int currentSum = 0 ;

    int prefix [] = new int [array.length];
    
    for (int i =1 ; i < prefix.length ; i++){  //calculate prefix array
         prefix [0]= array[0];
         prefix[i]=prefix[i-1]+ array[i];  //prefix sum
    }


    for (int start = 0; start < array.length ; start++){
        for(int end =start ; end < array.length ; end++){
            currentSum = start == 0 ? prefix[end] : prefix[end]- prefix[start-1] ; //ternary operator 
            //currSum of array

             if (maxValue < currentSum ){
               maxValue = currentSum;  
            }
        }
    }
    System.out.println("max value is : " + maxValue);
}

 //function 3 (KADANE ALGORITHM)
 public static void maxSubarrayKadane (int array[]){
    int currentSum = 0;
    int maxValue = Integer.MIN_VALUE;  //means -infinity

    for (int i = 0; i < array.length ; i++){
        currentSum += array[i];
        if (currentSum < 0){
             currentSum =0 ;
            }
        maxValue = Math.max(maxValue, currentSum);  // comparision between maxvalue and current sum
        }
        System.out.println("MAX SUM IS -->> " + maxValue);
    }

 //function 4 (kadane algorithm for all negative sum)
 public static void maxsubarraySum (int array[]){
    int currentSum = 0 ;
    int maxSum = Integer.MIN_VALUE;  // -infinity

    for (int i =0 ; i< array.length ; i++){
        currentSum += array[i];
        maxSum= Math.max(maxSum,currentSum);
    }
    System.out.println("maximum sum or smallest negative number is : "+ maxSum);
 }
   
    public static void main(String[] args) {
        int array [] = {2, 4,6,8, 10 };
        maxSubarray(array); //calling function 1 (brute force)

        int numbers [] = {1, -2 ,6 , -1 , 3};
        maxSubarray(numbers); //calling function 1 (brute force)

        maxSubarrayPrefix(numbers); //calling function 2 (prefix sum)

        int marks [] = { -2, -3 ,4 , -1 , -2 , 1 , 5 , -3}; 
        maxSubarrayKadane(marks);  //calling function 3 (kadane' s algorithm)

        int negMarks []= {-1 , -2 , -3 , -4}; 
        maxsubarraySum(negMarks); //calling function 4 

    }
} 