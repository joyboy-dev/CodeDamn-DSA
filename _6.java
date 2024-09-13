import java.util.Scanner;

class _6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number to check whether its even or odd :");
        int num = sc.nextInt();
        if ((num & 1) == 1) {
            System.out.println(num + " is a Odd number");
        } else {
            System.out.println(num + " is a Even number");

        }

        sc.close();
    }
}