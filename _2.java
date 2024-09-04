public class _2 {
    public static void main(String[] args) {
        int[] arr = new int [] {1,2,3,4,5,6};

        for (int i = 0; i < arr.length; i++) { // O(n)
            System.out.println(arr[i]);
        }

        int[] newarr = new int[arr.length - 1];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = arr[i]; // Copying elements from arr to newarr so the space complexity is also O(n) as it depends on the size of inputed array
        }

        for (int i = 0; i < newarr.length; i++) {
            System.out.println("newarr[" + i + "]=" + newarr[i]);
        }
    }
}
