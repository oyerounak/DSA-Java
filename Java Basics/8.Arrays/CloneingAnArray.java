import java.util.Arrays;

public class CloneingAnArray {
    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 736, 872 };
        int arr2[] = arr.clone();
        System.out.println(arr == arr2);
        System.out.println(arr[1] == arr2[1]);
        System.out.println(arr[2] == arr2[2]);
        System.out.println(Arrays.toString(arr2));

    }

}
