public class Prime_Num_JavaMethods {
    //function 1  //normal way to check for prime
    public static boolean checkPrime1 (int n ){
        boolean isPrime = true;
        if (n==2){
            return true;
        }else{
            for (int i =2; i<=n-1;i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
            
        }
        return isPrime ;
    }
    //function 2  //optimized way to check for prime
    public static boolean checkPrime2 (int N){
        boolean isPrime = true;
        if (N==2){
            return true;
        }else{
            for (int i =2; i<=Math.sqrt(N);i++){
                if(N%i==0){
                    isPrime = false;
                    break;
                }
            }
            
        }
        return isPrime ;
    }
    //function 3 //printing the prime numbers b/w 2 and range
    public static void printPrimeInRange (int range){
      for(int i =2; i <=range; i++){
        if(checkPrime1(i)){    //calling function 1 
            System.out.println("prime is -->"+ i); //true hone pr 
        }
      }
       }

    public static void main(String[] args) {
        
        System.out.println(checkPrime1(17));      //calling a function 1 
        System.out.println(checkPrime2(4));       //calling a function 2

        printPrimeInRange(10);  //calling function 3 //2 se lekar 10 tk ke prime numbers print 
        printPrimeInRange(56); //2 to 56
    }
}
