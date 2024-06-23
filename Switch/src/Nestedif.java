import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();

        String dept = in.next();

//        switch (empID){
//            case 1:
//                System.out.println("nik");
//                break;
//            case 2:
//                System.out.println("Nitish");
//                break;
//            case 3:
//                System.out.println("EmpID 3");
//                switch (dept){
//                    case "IT":
//                        System.out.println("IT dept");
//                        break;
//                    case "Management":
//                        System.out.println("Management dept");
//                        break;
//                    default:
//                        System.out.println("No dept");
//                }
//                break;
//            default:
//                System.out.println("Wrong ID");
//        }


        // Enhanced switch (enter alt+enter to get this)
        switch (empID) {
            case 1 -> System.out.println("nik");
            case 2 -> System.out.println("Nitish");
            case 3 -> {
                System.out.println("EmpID 3");
                switch (dept) {
                    case "IT":
                        System.out.println("IT dept");
                        break;
                    case "Management":
                        System.out.println("Management dept");
                        break;
                    default:
                        System.out.println("No dept");
                }
            }
            default -> System.out.println("Wrong ID");
        }
    }
}
