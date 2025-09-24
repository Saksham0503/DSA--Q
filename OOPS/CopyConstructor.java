package OOPS;
public class CopyConstructor {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.name = "skand";
        s1.roll = 123 ;
        s1.password = "abcdefghi" ;

        s1.marks [0] = 100 ;
        s1.marks [1] = 88 ;
        s1.marks [2] = 34 ;

        Student2 s2 = new Student2(s1);  //copy
        s2.password = "xyz";
        s1.marks[2] = 100 ;

        for (int i = 0 ; i <3 ; i++){
             System.out.println(s2.marks[i]);   
            
        }

        
    }
}

class Student2{
    String name ;
    int roll ;
    String password ;
    int marks[] ;

 /*    
    //shallow copy constructor
    Student2(Student2 s1){
       marks = new int [3];
       this.name = s1.name;
       this.roll = s1.roll ;
       this.marks = s1.marks ;
    }
*/

    //deep copy constructor 
    Student2(Student2 s1){
       marks = new int [3];
       this.name = s1.name ;
       this.roll = s1.roll ;
        
       for(int i = 0 ; i < 3 ; i++){
           this.marks[i] = s1.marks[i] ;
       }
    }

    Student2(){
        marks = new int[3];
        System.out.println("constructor is created ...");
    }

    Student2(String name){
        marks = new int[3];
        this.name = name ;
    }

    Student2(int roll){
        marks = new int[3];
        this.roll = roll ;
    }

}
