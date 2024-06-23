public class FindMin {
    public static void main(String[] args) {
        int[] arr = {121,65,35,78,34,21,23};
        int result = min(arr);
        System.out.println(result);
    }

    static int min(int[] arr){
        int min= arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        return min;
    }
}
