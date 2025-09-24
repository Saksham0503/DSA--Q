public class CH11_Questions {

    //QUESTION 1 

    public static int calAvg (int num1 , int num2 ,  int num3){

         int sum = num1 + num2 + num3 ;
         int average = (sum)/3 ;

         return average ;
    }

    //question 2

    public static boolean isEven (int num){

        if(num % 2 != 0){
            return false ;
        }

        return true ;
    }

    //question 3 
    public static boolean isPalindrome (int num){
        int oriNum = num ;
        int rev = 0 ;
        while (num > 0){
           //finding remainder
            int lastDigit = num % 10 ; 
            
            //doing reverse 
            rev =  rev*10 + lastDigit ;

           //reduce the number
           num = num/10 ;
        }
        
        //check palindrome
        if(oriNum == rev){
            return true ;
        }

        return false;
        
    }
    //question 4 ---> reading exercise related to functions

    //question 5
    
    public static void calSumOfDigit (int num){
        
        int oriNum = num ;
        int sum = 0 ;
        while(num > 0){

            // finding last digit 
            int lastDigit = num % 10 ;

            //finding sum 
            sum = lastDigit + sum ;

            //reducing number 
            num = num /10 ;
        }

        System.out.println("the sum of digits of "+ oriNum + " is : "+ sum);
    }

    public static void main(String[] args) {

        int result = calAvg(34, 04 , 5); //calling function 1
        System.out.println(result);
         
        boolean check1 = isEven(45);  //calling function 2
        boolean check2 = isEven(60);
        System.out.println(check1);
        System.out.println(check2);   

        boolean check3 = isPalindrome(33433);
        System.out.println("the number is palindrome : "+check3); //calling function 3
        
        calSumOfDigit(3024); //calling function 4
    
    }

}
