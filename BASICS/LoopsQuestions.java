import java.util.Scanner;
public class LoopsQuestions {
    public static void main(String[] args) {
        //question 1
        for (int i =0;i<5 ;i++){
            System.out.println("Hello World ");
            i +=2;                       //i=0 fhir i ki value 2,then 3 hogayi. i =3 fhir i ki value 5,then i =6
        }
        //question 2
        Scanner sc = new Scanner(System.in);
        int evensum =0;
        int oddsum =0;
        int choice;  //choice ko loop ke baahar hi declare krna hoga 
        do{
            System.out.print("ENTER THE NUMBER -->>");
            int n = sc.nextInt();
            if(n%2==0){
                System.out.println("even number");
                evensum += n;
            }else{
                System.out.println("odd number");
                oddsum += n;
            }
            System.out.println("press 1 to continue or press 0 to end ");
             choice = sc.nextInt();
        }while(choice ==1);
         
          System.out.println("THE SUM OF EVEN NUMBERS "+evensum);
          System.out.println("THE SUM OF ODD NUMBERS "+oddsum);

        
        //question 3
        System.out.print("enter the number -->>");
        int num = sc.nextInt();
        long fac = 1;  
        if(num ==0){
            System.out.println("factorial of number is --->> 1");
        }else{
           for(int k = 1;k<=num;k++){    //5!=5*4*3*2*1 or 1*2*3*4*5
            fac *= k;
            }
        }
        System.out.println("factorial of number is -->> "+fac);
        //question 4
        System.out.print("ENTER THE NUMBER -->> ");
        int number = sc.nextInt();
        System.out.println("/n"+"TABLE IS :");
        for(int a = 1;a<=10;a++){
             int product = number * a ;
            System.out.println(number + "X"+a + "=" + product);
        }
       //question 5
       /*for(int b =1;b<=5;b++){
        System.out.println("b ="+b);
       }
       System.out.println("b after the loop "+b);
*/
//right way is 
     int b;
     for(b=1;b<=5;b++){
        System.out.println("b ="+ b);
     }
     System.out.println("b after the loop"+b);
    }
}