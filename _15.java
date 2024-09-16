import java.util.Scanner;

class _15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to calculate factorial: ");
        int range = sc.nextInt(); // Correctly assign input to 'range'
        
        long result = 1;
        for (int i = range; i >= 1; i--) {
            result = result * i;
        }
        
        System.out.println("Factorial of " + range + " is: " + result);
        sc.close();
    }
}
