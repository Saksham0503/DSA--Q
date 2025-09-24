package RECURSION;
public class RecursionBasics1 {

    //question 1 -->> PRINTING IN DESCENDING ORDER FROM 1 TO 10
    public static void printDec (int n){
        //base case
        if (n==1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printDec(n-1);    //calling a function inside a function
    }

    //question 2 -->> printing in ascending order from 1 to 10
    public static void printInc (int n){

        // base case 
        if (n == 1){
            System.out.println(n);
            return;
        }
        printInc(n-1); //calling a function inside a function
        System.out.println(n); 
    }

    //question 3 --> finding factorial
    public static int fact(int n ){
        
        // base case 
        if (n==0){
            return 1;
        }

        int fnm1 = fact(n-1);  //calling a function inside a function
        int fn = n * fnm1 ;

        return fn;
    }

    //question 4 --> sum of n natural numbers
    public static int printSum(int n ){

       //base case
       if (n == 1){
         return 1 ;
       }

       int snm1 = printSum(n-1);  //calling a function inside a function
       int sumn = n + snm1;

       return sumn ;
    }

    //question 5 -->> print nth fibonacci series
    public static int printFib (int n){
        
        //base case 
        if (n==0){
            return 0 ;
        }
        if (n==1){
            return 1 ;
        }

        int fibnm1 = printFib(n-1);   //calling a function inside a function 
        int fibnm2 = printFib(n-2);   //calling a function inside a function

        int fibn = fibnm1 + fibnm2 ;

        return fibn ;
    }

    //question 6 -->> check whether array is sorted or not
    public static boolean isSorted (int arr [], int i){

         //base case 
         if (i == arr.length-1) {
            return true ;
         }

         //kaam
         if (arr[i] > arr[i+1]){
            return false ;
         }

         return isSorted(arr, i+1);  //calling a function inside a function
         
    }

    //question 7 -->> first occurence of an element in an array
    public static int firstOccurence (int arr1 [] , int i , int key){

        //base case 
        if ( i == arr1.length){
            return -1 ;
        }

        //kaam
        if (arr1[i] == key){
            return i ;
        }

        return firstOccurence(arr1, i+1, key) ; //calling a function inside a function
    }
    
    //question 8 -->> last occurence of an element in an array
    public static int lastOccurence(int arr1 [] , int i , int key){

        //base case 
        if (i == arr1.length){
            return -1 ;
        }

        //kaam
        int isFound = lastOccurence(arr1, i+1 , key);  //calling a function inside a function
        if (arr1[i] == key && isFound == -1){
            return i ;
        }

        return isFound ;
    }

    //question 9 -->> power x to the power n
    public static int power (int x , int n){

        //base case 
        if(n == 0){
            return 1 ;
        }

        //kaam
        int xnm1 = power(x, n-1); //calling a function inside a function
        int xn = x * xnm1 ;

        return xn;
    }

    //question 10 -->> power x to the power n (OPTIMIZED)
    public static int optimizedPower (int x , int n){
        
        //base case
        if (n == 0 ){
            return 1 ;
        }

        int halfPower = optimizedPower(x, n/2);     //calling a function inside a function
        int xpn = halfPower * halfPower;
        
        if (n % 2 != 0){          //if n is odd
            xpn = x * xpn ;
        }

        return xpn;
    }
    public static void main(String[] args) {
        printDec(10);  //calling a function

        printInc(10);  //calling a function

        System.out.println(fact(5));   //calling a function

        System.out.println(printSum(6));  //calling a function

        System.out.println(printFib(6));  //calling a function

        int arr [] = {1 , 2 , 3, 4 , 5};
        System.out.println(isSorted(arr, 0)); //calling a function

        int arr1 [] = {8, 3, 6 , 9, 5, 10 , 2 ,5 ,3};
        int key = 5;
        System.out.println(firstOccurence(arr1, 0, key)); //calling a function
        
        System.out.println(lastOccurence(arr1, 0 , key));  //calling a function
        
        System.out.println(power(2, 5)); //calling a function

        System.out.println(optimizedPower(2, 5));  //calling a function

    }
}
