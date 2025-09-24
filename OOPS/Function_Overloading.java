package OOPS;
public class Function_Overloading {
    //1. function overloading using parameters
       //function 1
        public static int CalculateSum (int a, int b){  
           return (a+b);                     // sum of two no. 
        }
       //function 2
     public static int CalculateSum(int a,int b, int c){         //calculateSum is the same name but different function
        return (a+b+c);                  // sum of three no. 
       }
      //both above functions are overloaded functions...! 

    //2. function overloading using data types 
      //function 3
      public static int  calculateSum(int a, int b ){       //calculating sum of two integers
        return (a + b);
      }
      //function 4 
      public static float calculateSum(float a, float b ){   //calculating sum of two decimals
        return (a+ b);
      }
    public static void main(String[] args) {
        // function overloading using parameters
        int sum = CalculateSum(2, 3)   ;  //calling function 1
        System.out.println("THE SUM IS :>> " + sum);

        sum = CalculateSum(4, 5, 7);   //calling function 2 
        System.out.println("THE SUM IS -->> "+sum);

        System.out.println("the sum is -->> "+ (sum = calculateSum(5, 8)));  //calling function 3

        System.out.println("THE SUM IS -->> "+ (calculateSum(3.7f, 6.7f))); //caling function 4 
        //sum hamara integer value store krta h isliye upar sum = calculateSum (3.7f,6.7f) nhi likh sakte
        }
}