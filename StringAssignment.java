import java.util.*;
import java.util.Arrays;
public class StringAssignment{
    public static void countReturn(String inp){
        int count = 0;
        
        for(int i=0; i<inp.length(); i++){
            char ch = inp.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }            
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        //For count return
        // Scanner sc = new Scanner(System.in);
        // String inp = sc.nextLine();
        // countReturn(inp);

        //Program to find anagrams in a String
        String str1 = "earth";
        String str2 = "heart";

        /*First convert the string into lowercase. So that we dont have to check seperately for
        lowercase and uppercase.*/
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //Check if the length are same or not
        if(str1.length() == str2.length()){
            //convert strings into character array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            //sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            //if the sorted char arrays are same or identical then the strings are anagrams
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println(str1 + " and " +str2+ " are anagrams of each others");
            } else{
                System.out.println(str1 + " and " +str2+ "are not anagrams of each others");
            }
        } else {
            System.out.println(str1 + " and " +str2+ "are not anagrams of each others");
        }        
    }
}