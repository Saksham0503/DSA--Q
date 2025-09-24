package ARRAYS;
import java.util.Scanner ;

public class Array_Basics {
    public static void main(String[] args) {
        //learning the arrays                                                
        int marks [] = new int [5];
        marks [0] = 5;
        marks [1] = 23;
        marks [2] = 34;
        marks [3] = 43;
        marks [4] = 34;

        for (int element : marks){
            System.out.println(element);
        }
        
        //taking input from user 
        int num []= new int [100];
        Scanner sc = new Scanner(System.in);

        num [0] = sc.nextInt(); //phy
        num [1] = sc.nextInt(); //chem
        num [2] = sc.nextInt(); //maths

        System.out.println("phy --> "+ num[0]);
        System.out.println("chem --> "+ num[1]);
        System.out.println("maths --> "+ num[2]);

        //updating an array
        num [2] =100; //maths
        System.out.println("maths--> "+ num[2]);

        int percentage = ((num[0] + num[1]+ num [2])/300 )* 100; //num [2]=100 will be used
        System.out.println("percentage : "+ percentage);
        
    }
}