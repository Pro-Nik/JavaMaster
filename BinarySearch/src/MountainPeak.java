public class MountainPeak {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <end){
            int mid = start+ (end - start )/2;
            if(arr[mid] >arr[mid+1]){
                // You are in dec part
                // this may be ans but look left also
                end = mid;
            }else{
                // you are in asc part of  array
                start = mid +1; // because we kow that  mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing the largest no
        // start and end are always trying to find max element in the above 2 checks
        // hence when they are pointing to just one element, that is the max one
        return start;  // return start or end bec both are same
    }
}
