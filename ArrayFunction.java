import java.util.Arrays;
public class ArrayFunction {
    public static void main(String[] args){
        int[] arr1 = {23, 45, 98, 76, 15};
        Arrays.sort(arr1);
        System.out.println("Sorted array:"+Arrays.toString(arr1));
        System.out.println(Arrays.binarySearch(arr1, 76));
    }
}
