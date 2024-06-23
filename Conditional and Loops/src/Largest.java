import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println("Enter any 3 no.:");

        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Largest of 3 numbers
//        if(a>b){
//            if(a>c){
//                System.out.println(a);
//            }
//            else {
//                System.out.println(c);
//            }
//        }
//        else{
//            if(b>c){
//                System.out.println(b);
//            }
//            else{
//                System.out.println(c);
//            }
//        }

        // 2nd method

//        int max =a;
//        if(b>max){
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }

        // 3rd method

//        int max =0;
//        if(a>b) {
//            max = a;
//        }else{
//            max = b;
//        }
//
//        if(c>max){
//            max = c;
//        }

        // 4th best

        int max =Math.max(c, Math.max(a,b));

        System.out.println(max);
    }
}
