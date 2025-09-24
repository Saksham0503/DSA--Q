package BIT_MANIPULATION;
import java.util.*;
public class Bit_Manipulation {

    //function 1
    public static void oddOrEven (int num ){
        
        int bitMask = 1;
        
            if ( (num & bitMask) == 0){
                //EVEN
                System.out.println("EVEN");
            }else{
                //ODD
                System.out.println("ODD");
            }
    }

    //function 2
    public static void get_iThBit (int num,int i){

        int bitMask = 1<<i ;            //left shift
        
        if((num & bitMask)== 0 ){
            System.out.println("the ith bit is :"+ 0);
        }else{
            System.out.println("the ith bit is :"+ 1);
        }
    }

    //function 3 
    public static void set_iThBit (int num , int i){

        int bitMask = 1 << i;        //left shift 

       int newNum =(num | bitMask);
       System.out.println("the num after ith bit has become 1 :"+ newNum);
    }

    //function 4
    public static void clear_iThBit (int num , int i){

        int bitMask = ~(1<<i);   //one's complement after doing left shift 

        int newNum = num & bitMask ;
        System.out.println("the num after ith bit has become 0 :"+ newNum);
    } 

    //function 5
    public static void update_iThBit (int num, int i ,int newBit){
        
        if (newBit == 0){
           clear_iThBit(num, i); 
        }
        
        else {
            set_iThBit(num, i); 
        } 
    }

    //function 6 
    public static void clearLastIBits (int num , int i){

        int bitMask = ~0 << i ;
        int newNum = num & bitMask ;

        System.out.println("the num after clearing last i bits has become : "+ newNum);
    }

    //function 7
    public static void clearRangeOfBits (int num , int i , int j){
        
        int a =( (~0) << (j+1)) ;
        int b =(1 << i) - 1;
        int bitMask = a | b;
        int newNum = num & bitMask ;
        System.out.println("the number after clearing a range of bits is :" + newNum);
    }

    //function 8
    public static void powerOfTwo (int n){

        if( (n & (n-1)) == 0 ){
          System.out.println("the number is power of two !!");
        }else{
            System.out.println("the number is not a power of two !!");
        }
        
    }

    //function 9 
    public static void countSetBits (int n){
        int count = 0 ;
        int bitMask = 1 ;
        while (n > 0){  
           if (( n & bitMask) != 0){  //check lSb =1
              count ++ ;
           }
            n = n >> bitMask ;
        }
        System.out.println("the no. of bits is : " + count);
    }

    //function 10 
    public static void fastExponentiation (int a, int n){
        int ans = 1;
        while (n > 0){ 

            if ((n & 1) != 0){ //checking lsb 
                ans = ans * a ;
            }
            a = a*a ;     //updating a after each iteration 
            n = n >> 1;   // right shift
        }
        System.out.println("the result is : " + ans);
    }
    public static void main(String[] args) {

        //binary AND 
        System.out.println(5 & 6);

        //binary OR
        System.out.println(5 | 6);

        //binary XOR
        System.out.println(5 ^ 6);

        //binary One's Compliment
        System.out.println( ~0);
        System.out.println( ~7);

        //binary left shift 
        System.out.println(5 << 2);

        //binary right shift 
        System.out.println(6 >> 1);

        //question 1 --: to check even or odd 
        oddOrEven(3);     //calling a function
        oddOrEven(11);     //calling a function 
        oddOrEven(14);    //calling a function
        
        //get ith bit
        get_iThBit(5, 3);  //calling function 2

        //set ith bit
        set_iThBit(10, 2);  //calling function 3 

        //clear ith bit
        clear_iThBit(10,1 );  //calling function 4
         
        //update ith bit
        update_iThBit(10, 2, 1);  //CALLING FUNCTION 5
 
        //clear last i bits
        clearLastIBits(15, 2);  //calling function 6

        //clear range of bits b/w i and j 
        clearRangeOfBits(10, 2, 4); //calling function 7

        // to check a number is power of 2 
        powerOfTwo(16);  //calling function 8

        //to count set bits in a number 
        countSetBits(10);  //calling function 9

        //fast expontiation
        fastExponentiation(3, 5);
    }


}
