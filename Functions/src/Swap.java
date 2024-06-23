public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Swaping
//        int temp;
//        temp = a;
//        a = b;
//        b = temp;

//        swap(a,b);
//        System.out.println(a + " " + b);

        String name = "Nik";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String naam) {
        naam = "Nitish";  // Not changing creating a new object only
    }

    static void swap(int a , int b){
        int temp;
        temp = a;
        a = b;
        b = temp;

        // this change will only be valid in this function scope
    }
}
