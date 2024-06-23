import java.util.Arrays;

public class PassinginFunc {
    public static void main(String[] args) {
        int[] nums = {3,5,4,3,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
        // arrays are mutable in java means changable
        // strings are immutable in java means can`t change
    }
    static void change(int [] arr){
        arr[0] = 45;
    }
}
