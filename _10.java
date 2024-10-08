// Reverse Integer

public class _10 {
    // Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
    // https://leetcode.com/problems/reverse-integer/description/
    public static void main(String[] args) {
        reverse(1534236469);
    }
    public static void reverse(int num) {
        int digit=0,rem=0;
        while (num!=0) {
            rem=num%10;
            if (digit<Integer.MIN_VALUE/10 || digit>Integer.MAX_VALUE/10) {
                System.out.println(0);
                break;
            }
            digit=rem+digit*10;
            num/=10;
        }
        System.out.println(digit);
    }
}
