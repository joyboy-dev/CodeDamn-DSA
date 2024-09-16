// class _12 {
//     public static void main(String[] args) {
//         System.out.println(bitwiseComplement(5));
//     }
//     public static int bitwiseComplement(int n) {
//         int val=toBinary(n);
//         System.out.println(val);

//         return complement(val);
//     }
//     public static int toBinary(int num){
//         int lastbit=0;
//         String result="";
//         while(num!=0){
//             lastbit=num&1;
//             num=num>>1;
//             result=lastbit+result;
//         }
//         return Integer.parseInt(result);
//     }
//     public static int complement(int num){
//         String s=String.valueOf(num);
//         for(int i=0;i<s.length()-1;i++){
//             if(s.charAt(i)==0){
//                 s.replace('0', '1');
//             }
//             else{s.replace('1', '0');}
//         }
//         return Integer.parseInt(s);
//     }
// }


// --shitty approach

/**
 * _12
 */
public class _12 {
    public static void main(String[] args) {
        System.out.println(complement(5));
    }
    public static int complement(int n){
        if (n==0) {
            return 1;
        }
        int copy=n;
        int result =0;
        if (n==0) {
            return 1;
        }
        int mask=0;
        while (copy!=0) {
            mask=mask<<1 |1;
            copy=copy>>1;

        }
        return (~n) & mask;
        // return result;
    }
}