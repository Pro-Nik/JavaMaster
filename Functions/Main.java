import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ques: Take 2 no. and print sum
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