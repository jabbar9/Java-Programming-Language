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
            if(str.charAt(i) != str.charAt(n-i-1)){
                //Not a Palindrome
                return false;
            }
        }
        return true;
    }
    public static float getShortestPath(String path){
        int x = 0, y = 0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);

            if(dir == 'S'){
                //South
                y--;
            } else if(dir == 'N'){
                //North
                y++;
            } else if(dir == 'W'){
                //West
                x--;            
            } else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }            
        }
        return sb.toString();
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
        // String str = "racecar";
        // System.out.println(isPalindrome(str));        

        //Shortest Path wiith directions
        // String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));

        //Strings Compare
        // String str1 = "Jack";
        // String str2 = "Jack";
        // String str3 = new String("Jack");

        // if(str1 == str2){
        //     System.out.println("Strings are Equals");
        // } else {
        //     System.out.println("Strings are not Equals");
        // }

        // if(str1 == str3){
        //     System.out.println("Strings are Equals");
        // } else {
        //     System.out.println("Strings are not Equals");
        // }

        // if(str1.equals(str3)){
        //     System.out.println("Strings are equals");
        // } else {
        //     System.out.println("Strings are not equlas");
        // }

        //Printing Substring
        // String str = "HelloWorld";
        // System.out.println(str.substring(0, 4));
        // System.out.println(subString(str, 0, 5));

        //Print largest String
        // String fruits[] = {"apple", "mango", "banana"};
        // String largest = fruits[0];
        // for(int i=1; i<fruits.length; i++){
        //     if(largest.compareTo(fruits[i]) < 0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);

        //String Builder in Java
        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a'; ch<='z'; ch++){
        //     sb.append(ch +" ");
        // }
        // System.out.println(sb);

        //Convert First letter to uppercase
        // String str = "hi, i am abdul";
        // System.out.println(toUpperCase(str));

        //String Compression
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}

// String str = "aaabbcccdd";
// System.out.println(compression(str));
