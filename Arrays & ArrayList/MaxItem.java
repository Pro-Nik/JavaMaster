public class MaxItem {
    public static void main(String[] args) {
        int [] arr = {2,4,5,3,2};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,2));
    }

  // Without range complete array max finder
    static int max(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int maxval = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }

    // Within the range
// work on edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end){

        if(end>start){
            return -1;
        }

        if(arr == null){
            return -1;
        }

        int maxval = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
