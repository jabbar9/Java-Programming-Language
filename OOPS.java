public class OOPS {
    public static void main(String args[]){
        // PEN p1 = new PEN(); //Created a pen object p1
        // p1.setColor("Blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);

        // Student s1 = new Student();
        // System.out.println(s1.name);

        // // BankAccount myAccount = new BankAccount();
        // // myAccount.username = "Abdul";
        // // myAccount.setPassword("ABDULJABBAR"); /*
        // we cant retrieve our password variable we can only change it by using setPassword Function
        //  */
        //Copy Constructor
        Student s1 = new Student();
        s1.name = "Abdul";
        s1.roll = 47;
        s1.password = "ABDULJABBAR";
        s1.marks[0] = 80;
        s1.marks[1] = 90;
        s1.marks[2] = 100;

        Student s2 = new Student(s1); // copy constructor
        s2.password = "JABBARSHAIKH";
        s1.marks[2] = 80;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[] = new int[3];

    //Shallow Copy Constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks; //Here only reference gets copied
    // }

    //Deep Copy Constructor
    /* In this constructor we copy every value as it is. Even if the values are changed 
     * in the Future it does not matter
     */
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student(){
        System.out.println("Comnstructor is called...");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
        marks = new int[3];
    }
}

class PEN{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}