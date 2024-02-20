import java.util.*;
public class StackBB {
    public static void pushAtBottom(Stack<Integer> s, int data){
        while (s.empty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0); //0 is index here where we push our value

        for(int i=1; i<stocks.length; i++){
            int currPrice = stocks[i];
            //Check till stack is not empty & currPrice is greater than top value
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){  //Opening
                s.push(ch);
            } else {
                //Closing
                if(s.isEmpty()){
                    return false;
                }
                if( (s.peek() == '(' && ch == ')')
                    || (s.peek() == '{' && ch == '}')
                    || (s.peek() == '[' && ch == ']')){
                        s.pop();
                    } else{
                        return false;
                    }
            }
        }
        if(s.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            //Closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true; //Duplicate
                } else{
                    s.pop();  //Opening Pair
                }
            } else{
                //Opening
                s.push(ch);
            }
        }
        return false;
    }public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            } else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //Next Smaller Left
        s = new Stack<>();
        for(int j=0; j<arr.length; j++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[j]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[j] = -1;
            } else{
                nsl[j] = s.peek();
            }
            s.push(j);
        }
        //Current Area : Width = j-i-1 = nsr[i] -nsl[i] -1
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] -nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("Maximum Area in Histogram:- "+maxArea);
    }
    public static void main(String[] args){
        //push at Bootom of Stack
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushAtBottom(s, 4);
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());            
        // }

        //Reverse a String Using Stack
        // String str = "abc";
        // String result = reverseString(str);
        // System.out.println(result);

        //Reverse a Stack Without using Extra Stack
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // reverseStack(s);
        // printStack(s);

        //Stock Span Problem
        // int stocks[] = {100,80,60,70,60,85,100};
        // int span[] = new int[stocks.length];
        // stockSpan(stocks, span);

        // for(int i=0; i<span.length; i++){
        //     System.out.println(span[i] + " ");
        // }

        //Next Greater Element
        // int arr[] = {6,8,0,1,3};
        // Stack<Integer> s = new Stack<>();
        // int nxtGreater[] = new int[arr.length];

        // for(int i=arr.length-1; i>=0; i--){
        //     //1:- While
        //     while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        //         s.pop();
        //     }
        //     //2:- if-else
        //     if(s.isEmpty()){
        //         nxtGreater[i] = -1;
        //     } else{
        //         nxtGreater[i] = arr[s.peek()];
        //     }

        //     //3:- Push in s
        //     s.push(i);
        // }
        // for(int i=0; i<nxtGreater.length; i++){
        //     System.out.print(nxtGreater[i] + " ");
        // }
        // System.out.println();

        //Valid parenthesis or Not
        // String str = "({})[]";
        // System.out.println(isValid(str));

        //Duplicate Parentheses Code
        // String str = "((a+b))";
        // String str2 = "(c+d)";
        // System.out.println(isDuplicate(str));

        //Maximum Area in Histogram
        int arr[] = {2,1,5,6,2,3};
        maxArea(arr);
    }
}
