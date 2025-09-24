import java.util.Scanner;
public class Conditional_Statements {
    public static void main(String[] args) {
        //INCOME TAX CALCULATOR
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER YOUR INCOME -->>  ");
    float income = sc.nextFloat();
if (income<500000) {
    System.out.println("0% TAX TO BE PAYED");
    float tax1 = 0.0f * income;
    System.out.println(tax1);      
}
 else if (income>=500000 && income <1000000){
    System.out.println("20% tax to be PAYED");
    float tax2 = 0.2f * income;
    System.out.println(tax2);
}
else {
    System.out.println("30% TAX TO BE PAYED");
    float tax3 = 0.3f *income ;
    System.out.println(tax3);
}
  
//making calculator with switch statements
System.out.println("ENTER FIRST VALUE -->");
float f = sc.nextFloat();
System.out.println("ENTER SECOND VALUE -->");
float g = sc.nextFloat();
System.out.println("ENTER THE OPERATOR");
char operator =sc.next().charAt(0);   //charat(0) kyun hai ye hm string waale chapter mein dekhenge
System.out.println("RESULT -->> ");
switch (operator) {
    case '+':
         System.out.println(f+g);
         break;
    case '-':
          System.out.println(f-g);
          break;
    case '*':
          System.out.println(f*g);
          break;
    case'/':
          System.out.println(f/g);
          break;
    case '%':
          System.out.println(f%g);
          break;
    default:                                                                                                                                                                                                                                                                                                       
          System.out.println("CALCULATOR CANNNOT CALCULATE :)>");
}
    }
}