import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // binary search has time and space complexity of O(log(n))

    int[] arr = new int[] {0,1,2,3,4,5,7,8,9,10};
    int st=0;
    int ed=arr.length-1;
    int target=sc.nextInt();
    
    while (st<=ed) {
        int md= (st+ed)/2;
        if (md==target) {
            System.out.println("Value Found : "+target+" at index :"+md);
            break;

        }
        else if(arr[md] <target){
            st=md+1;
        }
        else{
            ed=md-1;
        }
    }


    }
}
