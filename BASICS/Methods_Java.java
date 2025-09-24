import java.util.Scanner;
public class Methods_Java { //defining the class
    //function 1               
    public static void printHelloWorld(){       // yeh function hai class ke ander
        System.out.println("HELLO WORLD");
        return;
    }
    //function 2
    public static int calculateSum(int a, int b){          //yeh bhi function hai class ke ander
        
        int sum =a +b ;
        return sum;
    }
    //function 3
    public static void swap(int A,int B){
        
        int temp =A;
        A = B;
        B=temp;
         System.out.println("A is "+ A);       
          System.out.println("B is "+ B);
        return ;
    }    
    //function 4
     public static int calculateMultiply(int s, int r){

             int product = s *r;
             return product;
        }
    //function 5
    public static int  calculateFactorial(int n){
        int factorial =1;
        if (n==0){
            System.out.println("the factorial is >> 1");
        }else{
        for (int i = 1;i<=n;i++){
            factorial = factorial* i;
        }
    }
        return factorial;
    }
    //function 6 
    public static int binCoeff (int n , int r ){
        int factorial_n = calculateFactorial(n);
        int factorial_r = calculateFactorial(r);
        int factorial_nmr = calculateFactorial(n-r);

        int coefficient = factorial_n/(factorial_r*factorial_nmr);
        return coefficient;
    }
     
    
     public static void main(String[] args) {
        //learning functions / methods in java 
        printHelloWorld(); //calling a function 1
       Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int y =sc.nextInt();
        int sum =calculateSum(x, y);  //calling a function 
        System.out.println("THE SUM IS -->>"+sum);

    //swapping the numbers
    int A = 25;
    int B = 34;
    swap(A, B);  //calling a function
  
     //multiplication of two numbers
     int s = 45;
     int r = 40;
     int product = calculateMultiply(s, r); //calling a function
     System.out.println("product is "+ product);
     product =calculateMultiply(34,78);  //calling the function for 2nd time 
     System.out.println("the product is "+ product);
    
    //factorial of a number
     int n = 5;
     int factorial =calculateFactorial(n); // calling a function 
    System.out.println("the factorial is >>"+ factorial);
    factorial = calculateFactorial(8);    //again calling the function
     System.out.println("the factorial is >>"+ factorial);
     
    //binomial coefficient 
    int n1 = 5;
    int r1 =2;
    int coefficient = binCoeff(n1, r1); //calling the function
    System.out.println("the binomial coefficient is -->> "+ coefficient);
    coefficient = binCoeff(5, 4);
    System.out.println("the binomial coefficient is >>->>> "+coefficient);
     }
    }    



    
