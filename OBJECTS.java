public class OBJECTS {
    public static void main(String args[]){
        // PEN p1 = new PEN();
        // p1.setColor("Yellow");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());

        //Student Classs
        // Student s1 = new Student();
        // s1.name = "Abdul";
        // s1.rollno = 47;
        // s1.password = "abcd";
        // s1.marks[0] = 80;
        // s1.marks[1] = 60;
        // s1.marks[2] = 50;

        // Student s2 = new Student(s1);
        // s1.marks[2] = 100;
        // for(int i=0; i<3; i++){
        //     System.out.println(s2.marks[i]);
        // }

        //Fish Class
        // Fish shark = new Fish();
        // shark.eat();

        //Abstraction- Abstract Classess
        // Horse h = new Horse();
        // h.eats();
        // h.walks();
        // Chicken ch = new Chicken();
        // ch.eats();
        // ch.walks();

        // Queen q1 = new Queen();
        // q1.moves();

        Student s1 = new Student();
        s1.SchoolName = "GES";

        Student s2 = new Student();
        System.out.println(s2.SchoolName);

        Student s3 = new Student();
        s3.SchoolName = "JMV";
        
    }
}

class PEN{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}

// class Student{
//     String name;
//     int rollno;
//     String password;
//     int marks[];

    //Shallow Copy Constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollno = s1.rollno;
    //     this.password = s1.password;
    //     this.marks = s1.marks;
    // }

    //Deep Copy Constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollno = s1.rollno;
    //     for(int i=0; i<marks.length; i++){
    //         this.marks[i] = s1.marks[i];
    //     }
    // }

    // Student(){
    //     marks = new int[3];
    //     System.out.println("Constructor is Called.....");
    // }

    // Student(String name){
    //     marks = new int[3];
    //     this.name = name;
    // }

    // Student(int roll){
    //     marks = new int[3];
    //     this.rollno = roll;
    // }
// }

// class Animal{
//     String color;

//     void eat() {
//         System.out.println("Eats");
//     }

//     void breathe() {
//         System.out.println("Breathe");
//     }
// }

// class Fish extends Animal{
//     int fins;
    
//     void swims(){
//         System.out.println("Swims");
//     }
// }

abstract class Animal{
    void eats(){
        System.out.println("Animal Eats");
    }

    abstract void walks();
}

class Horse extends Animal{
    void walks(){
        System.out.println("Animal Walks....");
    }
}

class Chicken extends Animal{

    void walks(){
        System.out.println("Chicken Walks With 2 Legs....");
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Left, Right, Diagonal in Both Direction");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Left, Right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Left, Right, Diagonal by 1 Step Only");
    }
}

class Student{
    String name;
    int roll;

    static String SchoolName;
    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}