import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
//        list.add(67);
//        list.add(45);
//        list.add(32);
//        list.add(43);
//        list.add(87);
//        list.add(25);
//        list.add(22);
//        list.add(93);

//
//        System.out.println(list.contains(93));
//        list.set(0,456);  //update
//        list.remove(4);
//        System.out.println(list);

        // Input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));  // pass index here
        }

        

    }
}
