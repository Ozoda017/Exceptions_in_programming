public class Sem_1_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        //test1(arr);
        //System.out.println(test2( 10, 0));
        System.out.println(test3( "s"));
    }
    public static int [] test1(int[] arr){
        for (int i = 1; i < 5; i++){
            arr[i] = 0;
        }
        return arr;

    }
    public static int test2( int a, int b){
        return a/b;
    }
    public static int test3(String a){
        return Integer.parseInt(a);
        
    }
}