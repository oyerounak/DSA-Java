import java.util.Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int arr[] = {72,56,60,68,72,77,71,70,84,88,67,76};

        //Max in array Approach -1
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

        //Approach -2
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];

            }
            
        }
        System.out.println(max);

    }
}
