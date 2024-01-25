public class bitwise {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0) {
            //Even Number
            System.out.println("Number is even");
        } else{
            System.out.println("Number is Odd");
        }
    }
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;        
        } else {
            return 1;
        }
    }
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int newBitMask = newBit<<i;
        return n | newBitMask;
    }
    public static int clearIBits(int n,int i){
        int bitMask = ~(0)<<i;
        return n & bitMask;
    }
    public static int clearRangeOfBits(int n, int i, int j){
        int a = ~(0)<<(j+1);
        int b = (1<<i)-1;

        int bitMask = a | b;
        return n & bitMask;
    }
    public static boolean checkPower(int n){
        if((n & (n-1)) == 0){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isPowerOfTwo(int n){
        return (n &(n-1)) == 0;
    }
    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){ //Check LSB
                count++;                
            }
            n = n>>1;
        }
        return count;
    }
    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static int power(int x, int y, int p){
        int result = 1;

        while(y > 0){
            //If y is Odd multiply X with result
            if((y & 1) != 0)
                result = result * x;

                //Y must be even now
                y = y >> 1;
                x = x * x;                        
        }
        return result % p;
    }
    public static void main(String args[]){
        // System.out.println(5 & 6); //Binary AND
        // System.out.println(5 | 6); //Binary OR
        // System.out.println(3 ^ 4); //Binary XOR

        //Binary One's Compliment
        // System.out.println((~5));

        //Binary Left Shift
        // System.out.println((5<<2));

        // Binary Right Shift
        // System.out.println((6>>1));

        //Check Even & Odd
        // oddOrEven(5);
        // oddOrEven(8);

        //Get Ith Bit
        // System.out.println(getIthBit(10, 3));

        //Set Ith Bit
        // System.out.println(setIthBit(10, 2));

        //Clear Ith Bit
        // System.out.println(clearIthBit(10, 1));

        //Update Ith Bit
        // System.out.println(updateIthBit(10, 2, 1));

        //Clear I bits
        // System.out.println(clearIBits(15, 2));

        //Clear Range of Bits
        // System.out.println(clearRangeOfBits(10, 2, 4));

        //Check the number is power of 2 or not
        // System.out.println(checkPower(7));
        // System.out.println(isPowerOfTwo(8));

        //Count set bits in a Number
        // System.out.println(countSetBits(15));

        //Fast Exponentiation
        // System.out.println(fastExpo(3, 5));

        //Modular Exponentiation
        // int x = 2;
		// int y = 5;
		// int p = 13;

		// int mod = power(x, y, p);
		// System.out.print("Power is " + mod);
    }
}
