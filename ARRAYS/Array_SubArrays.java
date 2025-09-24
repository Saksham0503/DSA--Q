package ARRAYS;
public class Array_SubArrays {
    //function 1 
    public static void pairsinArray (int array [] ){
        
        for(int i = 0 ; i< array.length ; i++){
          int totalpairs = 0;
          // nested loop
          for (int j = i+1 ; j< array.length ;j++){
              System.out.print("("+array[i]+" , "+array[j]+")"+" ");
              totalpairs++;
          }
          System.out.print("TOTAL PAIRS --> "+ totalpairs);
         System.out.println();
        }  
    }

    //function 2
    public static void printSubarrays (int array[]){
        int totalsubarrays = 0;
        for (int first = 0 ; first < array.length ; first++){ //first 0 se lekar 4 tk chalega 
            //nested loop  
            for (int last = first  ; last < array.length ;last++ ){  //last --> first se lekar 4 tk chalega
                //nested loop
                for (int i = first ; i <= last ; i++){ //print krwana hai 
                    System.out.print(array[i]+" ");
                }
                totalsubarrays++;
                System.out.println();
            }
            System.out.println();
        }
       System.out.println("total SUBARRAYS --> "+ totalsubarrays);
    }
    public static void main(String[] args) {

        int array []= {2 , 4, 6, 8, 10};

    //making pairs in an array
         pairsinArray(array); //calling function 1
    //printing subarrays
         printSubarrays(array); //calling function 2
    }
}

