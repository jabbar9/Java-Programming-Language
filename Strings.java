import java.util.*;
public class Strings {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //Not a Palindrome
                return false;
            }            
        }
        return true;
    }
    public static void main(String args[]){
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str1 = new String("XYZ");

        // //Strings are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        //Counting the length
        // String fullName = "Jack Sparrow";
        // System.out.println(name.length());

        //Concatination in String
        // String firstName = "Abdul";
        // String lastName = "Jabbar";
        // String fullName = firstName + " " +lastName;
        // System.out.println(fullName);

        //Character At in String
        // String firstName = "Abdul";
        // String lastName = "Jabbar";
        // String fullName = firstName + " " +lastName;
        // printLetters(fullName);

        //Palindrome or not
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}
