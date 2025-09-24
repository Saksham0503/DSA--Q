package BACKTRACKING;
public class Backtracking1 {

    public static void findSubsets (String str , String ans , int i){
        
        if (i == str.length()){  //base case

            if (ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }

            return;
        }

        //yes choice
        findSubsets(str, ans+str.charAt(i), i+1);

        //no choice 
        findSubsets(str, ans, i+1);
    }

    public static void findPermutations (String str , String ans){
        
        if(str.length() == 0){  //base case
            System.out.println(ans);
            return;
        }
        //kaam
        for (int  i = 0 ; i < str.length() ; i++){

            char curr = str.charAt(i);
            //"abcdef"-->  "abc" +"ef" = "abcef"
            String newStr = str.substring(0, i)+ str.substring(i+1);
            findPermutations(newStr, ans+curr);
        }
    }


    public static void main(String[] args) {
        String str = "abc";

        findSubsets(str, "", 0); //calling function 1
        
        findPermutations(str, "");
    }
}
