import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//         fun(2,3,4,5,65,34,67);
//        multiple(2,3,"Nik","Meera","Muku");

//        demo(2,3,4,5,67,34);
        demo("nik","meera");
    }


static void demo(int ...v){
    System.out.println(Arrays.toString(v));
}

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }


    static void multiple(int a,int b, String ...v){  // variable length arguments are always at the end

    }


    static  void fun(int ...name){ //take an Array of int with variable space as a argument
        System.out.println(Arrays.toString(name));

    }
}
