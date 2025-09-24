import java.util.Scanner;;
public class Loops {
    public static void main(String[] args) {
        //1. while loops
        //printing numbers from 1 to 10
        int number = 1;
        while(number <=10){
            System.out.println("the number is "+ number);
            number++;
        }
        System.out.println("THE ABOVE NUMBERS ARE FROM 1 TO 10 ");

        //printing numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int number1 = 1;
        while(number1 <= range){
            System.out.println("number is "+number1);
            number1++;
        }

        //printing sum of first n natural numbers
        int range1 = sc.nextInt();
        int number2 =1;
        int sum =0;
        while(number2 <= range1){
            sum += number2;
            number2++;
        }
        System.out.println("sum of n natural numbers is "+ sum);

       //2.using for loop
       int n = sc.nextInt();
       int sum1 = 0;
       for(int i = 1;i<=n;i++){
          sum1 += i;
       }
       System.out.println("THE SUM OF N NATURAL NUMBERS IS " + sum1);
       //print square patterns
       for(int m =1;m<=4;m++){
          System.out.println("* * * * *");
    }
      //printing  numbers in reverse
      for(int a =10; a>=0 ; a--){
        System.out.println("the number is "+ a);
      }
      //printing reverse of a number
      int b = 34467;
      for(int j =1;j<=5;j++){
         int lastDigit =b%10;
         System.out.print(lastDigit);
         b=b/10;
      }
      System.out.println("\n");
      //printing reverse of  A number using while loop
      int c =10889;
      while(c>0){
       int lastDigit1 = c%10;
       System.out.print(lastDigit1);
       c = c/10;
      }
      System.out.println();
      //reverse the given number
      int v = 2345;
      int reverse = 0;
      while(v>0){
        int lastDigit2= v%10;
        reverse = (reverse *10)+lastDigit2;
        v=v/10;
      }
      System.out.print(reverse);
      System.out.println();
      //break statements questions
      //1. keep entering numbers untill user enters a multiple of 10
       for(int i =sc.nextInt(); i>0 ; i++){
        if(i%10==0){
           break;
        }
        System.out.println(i);
       }
       System.out.println("IF MULTIPLE OF 10 GET OUT OF LOOP");
       // using do while loop
       do{
        System.out.print("ENTER YOUR NUMBER-->" );
        int r = sc.nextInt();
        if (r%10==0){
            break;
        }
        System.out.println(r);
       }while(true);
       System.out.println("lets leave the loop");

    

    //using continue statements
       //display all numbers entered by user except multiples of 10
       do{
        System.out.print("ENTER YOUR NUMBER -->  ");
        int m = sc.nextInt();
        if(m%10==0){
            System.out.println("it is multiple of 10");
            continue;
        }
        System.out.println(m);
       }while(true);
       //we cannot write another code after the above loop because for every input it has an output
    
     
    

}
     }
    
 