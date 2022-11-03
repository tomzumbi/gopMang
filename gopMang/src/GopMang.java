import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 6};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[arr3.length - 1 - j] = arr2[arr2.length - 1 - j];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
