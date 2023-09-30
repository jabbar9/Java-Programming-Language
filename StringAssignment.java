import java.util.*;
public class StringAssignment{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int count = 0;

        for(char ch=inp.charAt(0); ch<inp.length(); ch++){            
            if(inp.charAt(ch) == 'a'){
                count++;
            } else if(inp.charAt(ch) == 'e'){
                count++;
            } else if(inp.charAt(ch) == 'i'){
                count++;
            } else if(inp.charAt(ch) == 'o'){
                count++;
            } else if(inp.charAt(ch) == 'u'){
                count++;
            }
        }
    }
}