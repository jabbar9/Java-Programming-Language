public class OOPSS {
    public static void main(String args[]){
        //Single Level Inheritance
        // Fish shark = new Fish();
        // shark.eats();

        //Multi-Level Inheritance
        // Dogs tommy = new Dogs();
        // tommy.eats();
        // tommy.legs = 4;
        // System.out.println(tommy.legs);

        //Hierarchial Inheritance
        // Bird parrot = new Bird();
        // parrot.fly();
        // parrot.eats();

        //Hybrid Inheritance
        // Shark s1 = new Shark();
        // s1.shark();

        //Polymorphism (1)-->Method Overloading
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1,2));
        // System.out.println(calc.sum((float)1.5,(float)2.5));
        // System.out.println(calc.sum(1,2,3));

        //Polymorphism (1)-->Method Overidding
        // Deer d1 = new Deer();
        // d1.eats();
    }
}

class Calculator{
    int sum(int a,int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;        
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}

//Base Class / Parent Class
class Animals{
    String color;
     void eats(){
        System.out.println("Eats");
     }
     void breathe(){
        System.out.println("Breathes");
     }
}

class Deer extends Animals{
    void eats(){
        System.out.println("Eats Grass");
    }
}
class Mammal extends Animals{
    int legs;
}

class Fish extends Animals{
    void swims(){
        System.out.println("Swims");
    }
}

class Shark{
    void shark(){
        System.out.println("Shark Class");
    }
}

class Bird extends Animals{
    void fly(){
        System.out.println("Fly");
    }
}
// class Dogs extends Mammal{
//     String breed;
// }

//Derived Class/ Child Class
// class Fish extends Animals{
//     int fins;
//     void swims(){
//         System.out.println("Swims in the Water");
//     }
// }
