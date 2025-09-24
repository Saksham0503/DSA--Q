import java.util.Scanner;
public class ConditionQuestions {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     //question 1 
        System.out.println("ENTER NUMBER --> ");
        int NUMBER= sc.nextInt();
        if(NUMBER<0) {
            System.out.println("NUMBER IS NEGATIVE");
        }else{
            System.out.println("NUMBER IS POSITIVE");
        }
    //question 2
     System.out.println("TO CHECK HEALTH , PLS ENTER YOUR YOUR BODY TEMPERATURE -->");
     double temp = sc.nextDouble();
     if(temp<100.0){
        System.out.println("YOU ARE HEALTHY !!");
     }else{
        System.out.println("YOU ARE HAVING FEVER ** TAKE CARE /HAVE REST");
     }
     //question 3
     System.out.println("ENTER WEEK DAY FROM 1 TO 7 --:>");
     int week = sc.nextInt();
     switch(week){
        case 1 : System.out.println("TODAY IS MONDAY, MONEY MONEY !!* ");
        break;
        case 2 : System.out.println("TODAY IS TUESDAY , STUDY HARD !!");
        break;
        case 3 : System.out.println("WEDNESDAY , GO TO WEDDING >>");
        break;
        case 4 : System.out.println("TODAY IS THURSDAY ,HELLO BRO ++>");
        break;
        case 5 : System.out.println("TODAY IS FRIDAY , have CHICKEN FRY IN LUNCH ....");  
        break;
        case 6 : System.out.println("TODAY IS SATURDAY , PLAN FOR PICNIC >>=:");      
        break;
        case 7 : System.out.println("TODAY IS SUNDAY ... SPEND TIME WITH SIBBLINGS >>* ");
        break;
        default: System.out.println(" DATA MISMATCH , MEET A DOCTOR ..");
     }
     //Question 4
     // using ternary statements 
     int a = 63 , b = 36;
     boolean x = (a<b)? true: false;
     int y = (a>b)? a:b;
     System.out.println("boolean result is >>  "+x);
     System.out.println("the result is : "+ y);

     //question 5
     // YEAR IS LEAP YEAR OR NOT
     System.out.println("ENTER THE YEAR _--->>");
     Float year = sc.nextFloat();
     boolean m= year%4==0;
     boolean n = year%100 !=0;
     boolean p =year %100==0 && year%400==0;   //hr 100 saal ke end mein leap year nhi aata hai ,but 400 saal ke end mein leap year hota hai
     if(m && (n || p)){
        System.out.println("THE YEAR IS LEAP YEAR ");
     }else{
        System.out.println("THE YEAR IS NOT A LEAP YEAR ");
     }
     
     

    }
}
