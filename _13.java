public class _13 {
    public static void main(String[] args) {
        System.out.println(isPrime(8));
    }
    public static boolean isPrime(int num) {
        boolean isPrime=true;
        for (int i = 0; i < num/2; i++) {
            if (num%2==0) {
                isPrime=false;
                break;
                
            }
        }
        if (isPrime) {
            return true;
        }
        else return false;
    }
}
