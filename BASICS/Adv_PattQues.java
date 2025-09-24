public class Adv_PattQues {
    //  QUESTION 1
    public static void numberPyramid (int totLine){
        int num = 1;
        for (int line =1 ; line <= totLine; line++){
            //spaces
            for (int spaces = 1; spaces<=(totLine-line) ;spaces++){
                System.out.print(" ");
            }
            //numbers 
            for ( int j = 1; j <=line ; j++ ){
               System.out.print(num + " ");
            }
            num++;
            System.out.println();
        }
    }

    // question 2
    public static void palindrome (int totLine){
    for (int line =1 ; line <= totLine ; line ++){
        //spaces
        for (int spaces =1 ; spaces <= totLine - line ; spaces++){
            System.out.print(" ");
        }
        //numbers
        //descending
        for (int num = line ; num >=1;num--){ 
            System.out.print(num);
        }
        //ascending
        for (int num = 2;num <=line;num++){
            System.out.print(num);
        }
        System.out.println();
    }
 }
    
public static void main(String[] args) {

    numberPyramid(5); //calling the function of ques 1

    palindrome(5); //calling the function of ques 2
 }
}