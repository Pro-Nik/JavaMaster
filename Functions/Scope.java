public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b = 20;
//        System.out.println(num); // num is not declared in this scope

        String name = "Nitish";

        // Block scope
        {
//             int a =45;  // already initialized in this function hence cant initialized again
            a =100;  // but you can modify this or reassign
            System.out.println(a);

            name = "Nik"; // reassign
            System.out.println(name);
             int c =99;  // it cant be valid outside this block
        }
      //  System.out.println(c); // not valid outside




        // Scoping in for loop
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
//            int a = 10;  // Already defined in this function
            a =10000; // valid reassign
        }

        int num =100; // you can initialised outside the block

    }



    static void random(){
//        System.out.println(a); // a is not in this function or scope
        int num =50;
        System.out.println(num);
    }
}
