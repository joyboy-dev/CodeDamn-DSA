// Time Complexity 

class _1{
    public static void main(String[] args) {
        System.out.println("Constant time complexity");

        int[] arr= new int[]{1,2,3,4,5,6};
        arr[0]+=10;  // linear time complexity O(1)

        // System.out.println(arr[0]);//time complexity O(1)
    
        System.out.println("Constant Space complexity");
        int max = arr[arr.length -1]; //Constant space complexity ie int --> 4 byte so O(4)
        
    
    }
}