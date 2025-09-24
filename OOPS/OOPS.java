package OOPS;
public class OOPS{
  public static void main (String args []){
/* 
     Pen p1 = new Pen();
     p1.setColor("Blue");  //caling the function
     System.out.println(p1.color);  //printing the attribute

     p1.setTip(5);
     System.out.println(p1.tip);

     p1.setColor("Olive Green");
     System.out.println(p1.color);

     p1.color = "Magenta Pink";
     System.out.println(p1.color);
*/

     BankAccount myAcc = new BankAccount();
     myAcc.username = "skandchaturvedi";
     System.out.println(myAcc.username);

     myAcc.setPassword("abcdefghi");
     

     Pen p1 =new Pen();
     p1.setColor("blue");
   //  System.out.println(p1.color);      -->> this shows error
     System.out.println(p1.getColor());

     p1.setTip(6);               
  //   System.out.println(p1.tip);        -->> this shows error
    System.out.println(p1.getTip());


    Student s1 = new Student ("skand");
    System.out.println(s1.name);
  }

}
/*

class Pen{
    String color ;   //properties of object
    int tip ;

    void setColor(String newColor){   //functions of object
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

*/
class Student{
    String name ;
    int age ;
    float percentage ;
    
    Student(String name){              //creating a constructor
        this.name = name;
    }
    void calPercentage(int phy ,int chem , int maths){
         percentage = (phy + chem + maths )/3;
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen{
    private String color ;
    private int tip ;
    
    String getColor (){               //getters  -->> returning our value
        return this.color ; 
    }

    int getTip(){                    //getters -->> returning our value
        return this.tip ;
    }

    void setColor (String color){
        this.color = color;                      //setting our values
    }

    void setTip (int tip){                       //setters : setting our values 
       this.tip = tip;
    }

}