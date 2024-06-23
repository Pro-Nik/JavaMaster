public class OrderAgnosticsBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {2,4,5,7,9,11,23,45,67,89,101};
        int[] arr = {98,86,75,63,61,56,45,37,23,11,9,7,4,1};
        int target = 23;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        // Find whether in ascending or descending
        boolean isAsc= arr[start] < arr[end];

//        if(arr[start] < arr[end]){
//            isAsc = true;
//        }
//        else{
//            isAsc= false;
//        }

        while(start<=end){
            // Find the mid
            //  int mid = (start+end)/2;  // might be the sum of start and end exceeds the range of int
            int mid = start + (end - start)/2; // better way

            if(arr[mid] == target){
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
