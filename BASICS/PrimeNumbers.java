import java.util.Scanner;
public class PrimeNumbers {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //printing prime numbers
        //method 1 
      System.out.println("ENTER YOUR NUMBER :>>> ");
      int n= sc.nextInt();
 
 if (n==2){
    System.out.println("prime number");
 }else{
      boolean isPrime = true;
     for(int i = 2 ; i <= n-1 ; i++){  //we can also use the condition i <= math. sqrt(n)
         if(n%i==0){
         isPrime = false;
         break;
         }
        }

       if (isPrime==true){
        System.out.println("prime ");
      }
       else{
        System.out.println("not prime");  
       }
    }
     
       
      }
        
 }
  
