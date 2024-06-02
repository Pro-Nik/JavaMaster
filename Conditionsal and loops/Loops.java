import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        syntax of for loop

        for(initialization; condition; increment/decrement){
        // body

        }
         */

        // Print number from 1 to 10
//
//        for(int i=1; i<=10; i += 1){
//            System.out.println(i);
//        }

//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//            System.out.println(i);
//        }

        // While loops

        /*
        syntax:
        while(condition){
        // body
        inc/dec
        }
         */

//        int i=1;
//        while(i<=5){
//            System.out.println(i);
//            i+=1;
//        }

        /*
        do-while loop:
        do{
         // body
         inc/dec
        }while(condition)
         */
      // Run one time if the condition is true or not
        int i=6;
        do {
            System.out.println("Hello world");
            i+=1;
        }while(i<=5);


    }
}
