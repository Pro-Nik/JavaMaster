public class SearchInRange {
    public static void main(String[] args) {
        int [] arr= {18,56,87,43,6,7};
        int res = linear(arr,56,2,5);
        System.out.println(res);

    }

    static int linear(int[] arr, int  target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        // Run a for loop
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        // Target not found
        return -1;
    }
}
