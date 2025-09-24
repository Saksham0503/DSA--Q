package OOPS;
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Humans soldier = new Humans();
        soldier.eats();

        soldier.hunts = "terrorists";
        System.out.println(soldier.hunts);
        soldier.legs = 2 ;
        System.out.println(soldier.legs);
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

//derived class 1
class Mammal extends Animal{
      int legs ;
}

//derived class 2
class Humans extends Mammal {
    String hunts ;

}
