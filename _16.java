public class _16 {
    public static void main(String[] args) {
        System.out.println(fact(5));
        print_num(10);
        System.out.println(add_num(5));
    }
    public static int  fact(int n) {
    if (n<=1) {
        return 1;
    }
    return n*fact(n-1);
    
    }
    public static void print_num(int range) {
        if(range==1) {System.out.println(1);}
        

        else{
            System.out.println(range);
             print_num(range-1);
            ;}
    }
    public static int add_num(int range) {
        if(range==1) {return (1);}
        

        else{
            
            return range + add_num(range-1);
            }
    }
}
