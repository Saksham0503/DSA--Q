package RECURSION;
public class RecursionBasics2 {

    //question 1 -->> tiling problem
    public static int tilingProblem (int n){
        //base case 
        if (n == 0 || n == 1){
            return 1 ;
        }
        
        //choices
        //vertical
        int fnm1 = tilingProblem(n-1);             //calling a function inside a function
        //horizontal 
        int fnm2 = tilingProblem(n-2);             //calling a function inside a function
        //total ways
        int totWays = fnm1 + fnm2 ;

        return totWays ;
    }

    //question 2 -->> removing duplicates in a string
    public static void removeDuplicate (String str , boolean map [] , int idx , StringBuilder newStr ){

        //base case
        if (idx == str.length() ){
            System.out.println(newStr);
            return ;
        }

        //kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true){
            //duplicate 
            removeDuplicate(str, map, idx+1, newStr);           //calling a function inside a function
        }else {
            map [currChar - 'a'] = true;          // map mein true store krwa denge

            removeDuplicate(str, map, idx+1, newStr.append(currChar)) ;          //calling a function inside a function
        }
    }

    //question 3 -->> friends pairing problem 
    public static int friendsPairing (int n){
        //base case
        if (n == 1 || n == 2){
            return n ;
        }
        //choices 
        //single
        int fnm1 = friendsPairing( n - 1) ;        //calling a function inside a function
        
        //pairs
        int fnm2 = friendsPairing(n-2);            //calling a function inside a function
        int pairWays = (n-1) * fnm2 ;
        
        //total ways
        int totWays = fnm1 + pairWays ;

        return totWays ;
    }

    //question 4 -->> binary strings with no consecutive 1's
    public static void printBinStrings (int n,int lastPlace , String binStr){

        //base case
        if (n == 0){
            System.out.println(binStr);
            return ;
        }
        printBinStrings(n-1, 0 , binStr+"0");      //calling a function inside a function
 
        if (lastPlace == 0){
            printBinStrings(n-1, 1, binStr+ "1");        //calling a function inside  a function
        }
    } 

    public static void main (String args []){
       System.out.println(tilingProblem(3));     //calling a function
       
       String str = "appnnacollege" ;
       StringBuilder newStr = new StringBuilder("");
       boolean map [] = new boolean [26];
       removeDuplicate(str, map, 0, newStr);       //calling a function

       System.out.println(friendsPairing(4));     //calling a function

       String binStr = "";
       printBinStrings(5, 0, binStr);    //calling a function
    }
}
