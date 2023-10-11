public class OOPS {
    public static void main(String args[]){
        PEN p1 = new PEN(); //Created a pen object p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class PEN {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class STUDENT{
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }
}
