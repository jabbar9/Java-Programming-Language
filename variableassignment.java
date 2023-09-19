import java.util.Scanner;

public class variableassignment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Question no 1
        // int a  = sc.nextInt();
        // int b  = sc.nextInt();
        // int c  = sc.nextInt();
        // float avg = a+b+c/3;
        // System.out.println(avg);

        //Question no 2
        // int side  = sc.nextInt();
        // float area  = side * side;
        // System.out.println(area);

        //Question no 3
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pen + pencil + eraser;
        System.out.println(total);
        float gst = total/100*18;
        float gst2 = gst + total;
        System.out.println(gst2);
    }
}
