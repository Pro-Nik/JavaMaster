public class Main {
    public static void main(String[] args) {
        int [] arr = {1,5,6,7,3,2};
        int result= linear(arr, 5);
        System.out.println(result);
    }

    // Search the target and return true or false

    static boolean linear3(int[] arr, int  target) {
        if (arr.length == 0) {
            return false;
        }
        // Run a for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        // Target not found
        return false;
    }




    // Search the target and return the element

    static int linear1(int[] arr, int  target) {
        if (arr.length == 0) {
            return -1;
        }
        // Run a for loop
        for (int j : arr) {
            if (j == target) {
                return j;
            }
        }
        // Target not found
        return -1;
    }






    // Search the array: Return index if item found
    // otherwise -1
    static int linear(int[] arr, int  target) {
        if (arr.length == 0) {
            return -1;
        }
        // Run a for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        // Target not found
        return -1;
    }
}