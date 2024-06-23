public class Overloading {
    public static void main(String[] args) {
        // Functions with same name but different argument is known as overloading
        fun(45);
        fun("nik");

        //Overloading example
        sum(4,6);
        sum(4,6,8);
    }

//    static void sum(int a , int b){
//        int sum=a+b;
//        System.out.println(sum);
//    }

    static int sum(int a , int b){
      return a+b;
    }

    static int sum(int a , int b , int c){
      return a+b+c;
    }


    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
