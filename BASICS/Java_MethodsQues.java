import java.util.Scanner;
public class Java_MethodsQues {
    //question 1
    //function 1
    public static float calculateAverage(float a, float b, float c){
       float average = (a+b+c)/3;
        return average;
    }
    //function 2 //question 2
    public static boolean isEven(int x){
      boolean  isEven = false;
        if(x%2==0){
            isEven=true;
            return true;
        }else{
            return false;
        }
    }
    //function 3 //question 3
    public static void checkPalindrome(int num){
        int palindrome = num;
        int reverse = 0;
        while(num>0){
            int digitofnum = num %10;
             reverse = reverse * 10 + digitofnum;
             num = num / 10;
        }
        if(palindrome==reverse){
            System.out.println("the number "+palindrome+" is palindrome of "+ reverse);
        }else{
            System.out.println("the number "+palindrome + "is not a palindrome of "+ reverse);
        }
        return ;
    }
    //function  5
    public static int calculateSum (int integer){
        int myInteger = integer;
        int digit = 0;
        int sum =0;
        while(integer > 0){
            digit = integer % 10; // digit nikalenge int se, 
            sum += digit;        // sum kr lenge digit ,jitni baar loop chalega we will get sum
            integer = integer /10; //integer se last digit remove krenge
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER ");
        float num1 = sc.nextFloat();
        System.out.println();
        System.out.print("ENTER SECOND NUMBER ");
        float num2 = sc.nextFloat();
        System.out.println();
        System.out.print("ENTER THIRD NUMBER ");
        float num3 = sc.nextFloat();

        System.out.println("THE AVERAGE OF 3 NUMBERS IS ---> "+ calculateAverage(num1,num2,num3)); //calling function 1

        System.out.println("THE NUMBER ENTERD IS EVEN "+isEven(100)); //calling function 2
       
        System.out.print("ENTER YOUR NUMBER -->>");
        int num = sc.nextInt();
        checkPalindrome(num); //calling function 3
        System.out.println("\n");
        
        System.out.print("ENTER THE NUMBER -->> ");
        int integer = sc.nextInt();
        System.out.println("the sum of the digits of integer is "+calculateSum(integer));//calling function 5
    }
}