import java.util.Scanner;

public class _8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range to count bits: ");
        int range = sc.nextInt();
        int[] result = new int[range + 1]; // Adjust the array size to match the range

        for (int i = 0; i <= range; i++) {
            String binary = convertToBinary(i); // Get the binary representation as a string
            int bitCount = countOnes(binary);   // Count the '1' bits
            result[i] = bitCount;               // Store the count of 1s in the result array
        }

        // Output the result for each number
        for (int i = 0; i <= range; i++) {
            System.out.println("Number: " + i + " | Binary: " + convertToBinary(i) + " | Count of 1s: " + result[i]);
        }

        sc.close();
    }

    // Function to convert an integer to its binary representation as a string
    public static String convertToBinary(int a) {
        if (a == 0) {
            return "0";
        } else {
            String val = "";
            while (a > 0) {
                val = (a % 2) + val;
                a = a / 2;
            }
            return val;
        }
    }

    // Function to count the number of '1' bits in a binary string
    public static int countOnes(String binary) {
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
