import java.util.Scanner;
public class bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pen + pencil + eraser;
        float gst = total/100*18;
        float gst1 = total + gst;
        System.out.println("Total Cost of Items is:- " +total);
        System.out.println("Amount After adding GST is:- " +gst1);
    }
}
