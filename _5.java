import java.util.Scanner;
// COnverting Decimal to Binary 
public class _5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number :");
        int decimal = sc.nextInt();
        int temp = decimal;
        String result="";

        // Converting decimal to binary
        while (temp > 0) {
            int rem = temp % 2; // Remainder (binary digit)
            result=rem + result;  // Append remainder to binary result
            temp = temp / 2;     // Divide decimal number by 2
        }

        // Binary number will be in reverse order, so we reverse it
        System.out.println("Binary representation of " + decimal + " is: " + result);
        
        sc.close();
    }
}

