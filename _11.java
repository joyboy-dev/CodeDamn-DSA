// Given an integer n, return true if it is a power of two. Otherwise, return false.

// An integer n is a power of two, if there exists an integer x such that n == 2x.

 

// Example 1:

// Input: n = 1
// Output: true
// Explanation: 20 = 1
// Example 2:

// Input: n = 16
// Output: true
// Explanation: 24 = 16
// Example 3:

// Input: n = 3
// Output: false
 

// Constraints:

// -231 <= n <= 231 - 1

public class _11 {
public static void main(String[] args) {
    int binary=toBinary(258);
    System.out.println(binary);
    System.out.println(countOne(binary));
}    
public static int toBinary(int a){
    int result=0;
    String binary="";
    int bit=0;
    while (a!=0) {
        bit=a&1;
        binary=bit+binary;
        a=a>>1;
    }
    result=Integer.parseInt(binary);


    return result;
}
public static boolean countOne(int a){

    int noOfOnes=0;
    String val=String.valueOf(a);
    for (int i = 0; i < val.length()-1; i++) {
        if (val.charAt(i)=='1') {
            noOfOnes++;
        }
    }
    return noOfOnes==1;
}
}
