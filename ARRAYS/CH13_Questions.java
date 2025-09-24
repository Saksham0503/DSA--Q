package ARRAYS;
public class CH13_Questions {

    //question 1 
    public static boolean checkArray (int arr []){
      int count = 0 ;

      for (int i = 0 ; i < arr.length ; i++){
         
        for (int j = i+1 ; j < arr.length ; j++){

             if (arr[i] == arr[j]){
               count ++ ;
             }
             if (count == 1){
              return true ;
             }
        }

      }
      return false;
      
    }

    //question 2 --> array rotation 
    public static int isFound (int nums [] , int target){
      int bp = - 1 ; 
      int n = nums.length ;
      for(int i = 0 ; i < n ; i++){ 
         if (nums[i] > nums[i+1]){
           bp = i; 
           break;
         } 
      }

      int lp = bp + 1 ;
      int rp = bp ;
       
      while(lp != rp){

        if (nums[lp] == target){
           return lp ;
        }

        if (nums[lp] > target){
           rp = (n + rp - 1) % n ;
        }
        else{
           lp = ( lp + 1 ) % n ;
        }
      } 

      return -1;
    }
    
    //question 3 --> stock price 
    public static int stockPrice (int price []){

      int buyingPrice = Integer.MAX_VALUE ;     // +infinity
      int maxProfit = 0 ;
      
      for(int i = 0 ; i < price.length ; i++){
        int sellingPrice = price[i];       //today's price
        if(sellingPrice > buyingPrice){    
           int profit  = sellingPrice - buyingPrice ;   //today's profit
           maxProfit = Math.max(maxProfit , profit);
        }else{
          buyingPrice = price[i];
        }
      }

      return maxProfit ;
    }

    //question 4 --> trapping rainwater
    public static int trappingRainwater (int height []){

      //max left
      int maxLeft []= new int [height.length];  
      maxLeft[0]= height[0];
      for (int i = 1 ; i < height.length ; i++ ){  
        maxLeft[i] = Math.max(maxLeft[i-1], height[i]);
      }

      //max right 
      int maxRight [] = new int [height.length] ;
      maxRight[height.length - 1] = height[height.length - 1];
      for (int i = height.length - 2 ; i >=0 ; i--){
        maxRight[i] = Math.max(maxRight[i+1], height[i]);
      }

      //water trapping
      int trappedWater  = 0 ;
      for(int i = 0 ; i < height.length ; i++){
         int width = 1 ;
         int waterLevel = Math.min(maxLeft[i], maxRight[i]);

         trappedWater += (waterLevel - height[i]) * width ;
      }

      return trappedWater ;
    }
    //question 5 --> triplets 
    
     public static void triplets(int arr []){
        
      for(int  i = 0 ; i < arr.length ; i++){
        for(int j = i+1 ; j < arr.length ; j++){
          for(int k = j+1 ; k < arr.length ; k++){
               
               if(arr[i] + arr[j] + arr[k]  == 0 && i!=j && i!=k && j!=k){
                 System.out.println("["+arr[i] + " " +arr[j] +" " + arr[k]+ "]");
               }
          }
        }
      }
     }
    public static void main(String[] args) {
        
        //question 1 
        int arr1 [] = {1 , 2 , 3 , 1};
        int arr2 [] = {1 , 2 , 3 , 4};
        int arr3 [] = {1 , 1 , 1 , 3 , 3 , 4 ,3 , 2 , 4 , 2};

        System.out.println(checkArray(arr1));  //calling function 1
        System.out.println(checkArray(arr2));
        System.out.println(checkArray(arr3));

        //question 2
        int nums [] = {4 , 5 , 6 , 7 , 0 , 1 , 2};
        int target = 0 ;
        int target1 = 3;
        System.out.println(isFound(nums, target));     //calling the function
        System.out.println(isFound(nums, target1));
        int nums1 [] = {1};
        int target2 = -1;
        //System.out.println(isFound(nums1, target2)); 

        //question 3 
        int price [] = {7 , 1, 5 ,3 , 6 ,4 };
        System.out.println("Maximum profit is : "+ stockPrice(price));  //calling the function

        int price1 [] = {7 , 6 , 4 ,5 , 3};
        System.out.println("Maximum profit is " + stockPrice(price1));   //calling the function

        //question 4
        int height [] = {0 , 1, 0 , 2 , 1 , 0 , 1 , 3 , 1, 2 , 1};
        int height1 [] = { 4, 2 , 0 , 3 ,2 , 5};
        System.out.println("trapped water = "+ trappingRainwater(height));
        System.out.println("the trapped water == "+ trappingRainwater(height1));  //calling the function

        //question 5
        int arr [] = {-1 , 0 , 1 , 2 , -1 , -4};
        triplets(arr);         //calling the function
        
        int array1 [] = {};
        int array2 [] = {0};
        triplets(array1);
        triplets(array2);
        
    }
}
