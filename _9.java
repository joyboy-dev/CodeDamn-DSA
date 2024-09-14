public class _9 {
    // Using bitwise operation

    public static void main(String[] args) {
        Converter c = new Converter();
        // System.out.println(c.convertBinaryToDecimal(0));
        c.convertDecimalToBinary(10);
        c.convertBinaryToDecimal(1010);
    }
    // Binary to decimal

}

class Converter {
    public static void convertDecimalToBinary(int num) {
        int n = num;
        if (n == 0) {
            System.out.println(0);
            // return 0
        } else {
            String result = "";
            while (num != 0) {
                result = (num & 1) + result;
                num = num >> 1;
            }
            System.out.println("The Binary Representation of " + n + " = " + result+"");
            // return Integer.parseInt(result);
        }
    }

    public static void convertBinaryToDecimal(int num) {
        String val = String.valueOf(num);
        double result = 0;
        for (int i = 0; i < val.length(); i++) {
            if (val.charAt(val.length()-1-i) == '1') {
                result = result + Math.pow(2, i);
            }

        }
        System.out.println("The Decimal Representation of " + val + " = " + result);

    }

}