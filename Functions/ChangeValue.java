import java.util.*;
public class ChangeValue {
    public static void main(String[] args) {
        //Create an array
        int [] arr = {1,3,4,56,3};
        change(arr);  // Calling the object not element
//        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
    }

    static void change(int[] nums){
        nums[0]=99;  // if you make a change to the object via ref variable, saame object will be changed
    }
}
