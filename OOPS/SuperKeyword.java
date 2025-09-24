package OOPS;
public class SuperKeyword {
public static void main(String[] args) {

    HorseChetak h = new HorseChetak();
    
}
}

//parent class
class WildAnimal {
    String color ;

    WildAnimal(){             //constructor
        System.out.println("Animal constructor is called ....");
    }
    void attacks(){
         System.out.println("attacks and kills :)");
    }
}

//sub class 
class HorseChetak extends WildAnimal{

    HorseChetak(){                 //constructor
        
        super();                   //parent class constructor is called

        super.attacks();           //parent class function is called

        super.color = " white ";    //parent class property is called
        System.out.println(color);

        System.out.println("Horse constructor is called");
    }
}
