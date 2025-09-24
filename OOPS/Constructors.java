package OOPS;
public class Constructors {
    public static void main(String[] args) {

        Student1 s1 = new Student1();

        Student1 s2 = new Student1("Skand");
        System.out.println(s1.name);

        Student1 s3 = new Student1(123);
        System.out.println(s1.roll);
    }
}

class Student1 {
    String name ;
    int roll ;

    Student1(){
        System.out.println("hello i m non parameterized");
    }

    Student1(String name ){
        this.name = name ;
    }

    Student1(int roll){
        this.roll = roll ;
    }
}