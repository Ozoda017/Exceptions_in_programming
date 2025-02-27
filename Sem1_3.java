import java.util.Arrays;

public class Sem1_3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        try{
            int[] result = diffArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (IllegalArgumentException e){
            System.err.println(e.getMessage());          
        }
    }
public static int[] diffArrays(int[] arr1, int[] arr2) throws IllegalArgumentException{
    if (arr1.length != arr2.length){
        throw new IllegalArgumentException("Массив имеет разную дину");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            result[i]= arr1[i] - arr2[i];
        }
        return result;

        }
}
