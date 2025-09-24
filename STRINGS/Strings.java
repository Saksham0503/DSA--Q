package STRINGS;
import java.util.* ;
public class Strings {

    //function 1 
    public static void findCharAt (String book ){

        for (int i = 0 ; i < book.length() ; i++){
            System.out.print(i + "= " + book.charAt(i) + " ");
        }
        System.out.println();
    }

    //FUNCTION 2
    public static boolean isPallindrome (String word ){
        for (int i = 0 ; i < word.length()/2 ; i++){
            int n = word.length();
             if(word.charAt(i) != word.charAt(n-i-1)){
                return false;
             }
        }
        return true ;
    }

    //FUNCTION 3 
    public static void getShortestPath (String path){
        int x =0 , y = 0 ;
        for (int i = 0; i < path.length() ; i++){
            char dir = path.charAt(i) ;
           
            //NORTH
            if (dir == 'N'){
                y++;
            }

            //SOUTH
            else if (dir == 'S'){
                y--;
            }
            
            //EAST 
            else if (dir == 'E'){
                x++;
            }

            //WEST
            else {
                x--;
            }
        }
        
        int x_sq = x*x ;
        int y_sq = y*y ;
        
        float shortestdistane =(float)Math.sqrt(x_sq + y_sq);

        System.out.println(shortestdistane);
    }

 public static void main(String[] args) {
     char arr [] = { 'a' , 'b' , 'c' , 'd'} ;
     String name = "skand";
     String name2 = new String("SKAND#@7&");

     //STRINGS ARE IMMUTABLE 
      Scanner sc = new Scanner(System.in) ;
      String name3 ;
      name3 =sc.nextLine();

      System.out.println(name3); //printing the string

      //STRING -->>> LENGTH
      String fullname = "skand malviya";
      System.out.println(fullname.length());

      //string concatenate
      String firstname = "SKAND";
      String lastname = "MALVIYA";

      String fullname1 = firstname + " " + lastname ;
      System.out.println(fullname1);

      String book = "ART OF WAR";
      System.out.println(book.charAt(4));

      findCharAt(book); //calling a function



      // QUESTION -->> IS THE STRING A PALLINDROME 

      String word = "RACECAR" ;
      isPallindrome(word) ; //calling function 2
      System.out.println(isPallindrome(word));
      
      //QUESTION -->> TO GET THE SHORTEST PATH

      String path = "WNEENESENNN";
      getShortestPath(path); //calling a function 3

      //COMPARISONS IN STRING 
      String s1 = "skand";
      String s2 = "skand";
      String s3 = new String("skand");

      if (s1 == s2 ){
        System.out.println("IS EQUAL");
      }  
      else{
        System.out.println(" not equals");
      }

      if (s1 == s3 ){
        System.out.println("is equals");
      }
      else {
        System.out.println("not equals");
      }
      
      if(s1.equals(s3)){
        System.out.println("you r right");
      }else{
        System.out.println("you r wrong");
      }
      

      //USING SUBSTRING FUNCTON

      String place = "Jaipur";
      System.out.println(place.substring(0,4));

      //question ==>> TO FIND THE LARGEST STRING
      String fruits [] = {"apple" , "mango" , "banana"};

      String largest = fruits[0];
      for (int i = 1 ; i < fruits.length ;i++){
            if(largest.compareTo(fruits[i])  < 0){
                 largest = fruits[i];
            }
      }

      System.out.println("THE LARGEST STRING IS -->> " + largest);
 } 

}
