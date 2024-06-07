import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner in = new Scanner(System.in);

        //Array of primitives
        arr[0] = 23;
        arr[1] = 34;
        arr[2] = 67;
        arr[3] = 78;
        arr[4] = 90;

//        System.out.println(arr[3]);

        // Input using loops

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i <arr.length ; i++) {
//            System.out.println(arr[i]);
//        }

        // Enhanced for loop
//        for (int j : arr) {  // for every element in array, print the array
//            System.out.println(j);  // j represent the element of the array
//        }


        // Array of objects

        String[] str = new String[4];
        for (int i = 0; i <str.length ; i++) {
            str[i] = in.next();

        }

        //Modify
        str[1] = "Nik";
        System.out.println(Arrays.toString(str));
    }
}
