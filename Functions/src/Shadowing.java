public class Shadowing {
   static int x=90;   // this will be shadowed at line 7
    public static void main(String[] args) {

        System.out.println(x);  // 90
//        int x = 50;  // the class var at line 2 is shadowed by this

        int x;
//        System.out.println(x);  // scope will begin when value is initialised
        x = 50;
        System.out.println(x);   //50
//        fun();
    }
    static  void fun(){
        System.out.println(x);
    }
}
