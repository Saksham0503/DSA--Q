package OOPS;
public class Inheritance {
    public static void main(String[] args) {
        Fish whale = new Fish();
        whale.eats();
    }
}

//base class
class Animal {
    String color ;

    void eats (){
        System.out.println("eats");
    }

    void breathes (){
        System.out.println("breathes");
    }
}

//derived class
class Fish extends Animal {
      int fins ;

      void swims(){
        System.out.println("Swims in water");
      }
}
