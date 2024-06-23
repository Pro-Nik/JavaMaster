public class Floor {

        public static void main(String[] args) {
            int[] arr = {2,5,6,9,21,45,67,89,101};
            int target = 40;
            int ans= floor(arr,target);
            System.out.println(ans);

        }

        // Return the index: greatest no  >= target
        static int floor(int[] arr, int target){
            int start = 0;
            int end = arr.length-1;

            while(start<=end){
                // Find the mid
                //  int mid = (start+end)/2;  // might be the sum of start and end exceeds the range of int
                int mid = start + (end - start)/2; // better way

                if(target < arr[mid]){
                    end = mid - 1;
                } else if (target> arr[mid]) {
                    start = mid +1;
                } else{
                    return mid; // ans found
                }
            }
            return end;
        }
    }

