import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int[][] arr = {
                {3,6,7,5},
                {45,8,123,63},
                {32,7,9},
                {56,87}
        };
        int target = 23;
        int [] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

        int res=max(arr);
        System.out.println(res);
    }
    static int[] search(int[][] arr, int target){
        for(int row=0;row<arr.length;row++){
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // MAx in 2D array

    static int max(int[][] arr){
        int max = arr[0][0];
        for(int row=0;row<arr.length;row++){
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]> max){
                    max =  arr[row][col];
                }
            }
        }
        return max;
    }

}
