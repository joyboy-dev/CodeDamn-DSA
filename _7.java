import java.util.Scanner;

public class _7 {
    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        // Bitwise AND
        int andResult = a & b; // 0101 & 0011 = 0001
        System.out.println("a & b = " + andResult); // Output: 1

        // Bitwise OR
        int orResult = a | b; // 0101 | 0011 = 0111
        System.out.println("a | b = " + orResult); // Output: 7

        // Bitwise XOR
        int xorResult = a ^ b; // 0101 ^ 0011 = 0110
        System.out.println("a ^ b = " + xorResult); // Output: 6

        // Bitwise NOT
        int notResult = ~a; // ~0101 = 1010 (in two's complement, it's -6)
        System.out.println("~a = " + notResult); // Output: -6

        // Left Shift
        int leftShiftResult = a << 1; // 0101 << 1 = 1010
        System.out.println("a << 1 = " + leftShiftResult); // Output: 10

        // Right Shift
        int rightShiftResult = a >> 1; // 0101 >> 1 = 0010
        System.out.println("a >> 1 = " + rightShiftResult); // Output: 2

        // Unsigned Right Shift
        int unsignedRightShiftResult = -5 >>> 1; // 1111...1011 >>> 1 = 0111...1101
        System.out.println("-5 >>> 1 = " + unsignedRightShiftResult); // Output: large positive number
        noOfOnes();
    }
    public static void noOfOnes() {
        Scanner sc = new Scanner(System.in);
        long value=sc.nextLong();
        long n= value;
        int ones=0;
        while (n!=0) {
            if ((n&1)==1) {
                ones++;

            }
            n=n>>1;
        }
        System.out.println(ones);


    }
}
