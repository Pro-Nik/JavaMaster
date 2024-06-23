public class FirstAndLastPosition {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        // Check for first occurence if target first
        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
            ans[1] = search(nums, target,false);

        }

        return ans;
    }

    // this function just return the index value for what we are seraching
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // Find the mid
            //  int mid = (start+end)/2;  // might be the sum of start and end exceeds the range of int
            int mid = start + (end - start) / 2; // better way

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //potential ans found
                ans = mid;
                if (findStartIndex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
