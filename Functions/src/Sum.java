import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //function call
//         int ans = sum2();
//        System.out.println(ans);
//         sum();
//         sum();
//         sum();

        int ans = sum3(4,6);
        System.out.println(ans);
    }

    /*
    return_type name (){
    // body
     return statement:
     }
     */

    // pass the value of numbers when you are calling the method in main()

    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }

    // Return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;

        System.out.println("Enter the first number:");
        num1 = in.nextInt();

        System.out.println("Enter the second number:");
        num2 = in.nextInt();

        sum = num1 + num2;
        return sum;

//        System.out.println("This will never run because after return ");
    }

     static void sum(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;

        System.out.println("Enter the first number:");
        num1 = in.nextInt();

        System.out.println("Enter the second number:");
        num2 = in.nextInt();

        sum = num1 + num2;
        System.out.println("Sum is " + sum);
    }
}
