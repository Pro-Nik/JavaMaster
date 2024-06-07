import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        System.out.println("Enter name:");
        Scanner in = new Scanner(System.in);
        String  name= in.next();

        String personalized = myGreet(name);
        System.out.println(personalized);

    }

     static String myGreet(String name) {
        String mess= "Hello " + name;
        return mess;
    }

    static String greet(){
        String greeeting = "How are you";
        return greeeting;
    }
}
