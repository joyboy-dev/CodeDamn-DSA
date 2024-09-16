public class _17 {
    public static void main(String[] args) {
        System.out.println(powN(2, 3));
        System.out.println(powN_usingRecursion(2, 3));
    }

    public static int powN(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        return result;
    }

    public static int powN_usingRecursion(int x, int n) {
        if (n==1) {
            return x;
        }
        if (n==0) {
            return 1;
        }
        return x *powN_usingRecursion(x, n-1);
    }
}