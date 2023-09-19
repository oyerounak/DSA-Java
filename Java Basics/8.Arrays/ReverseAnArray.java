import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[]=new int[]{1,1,2,2,3,4,4,5,5,1,2,5};
        System.out.println(Arrays.toString(arr));

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }

    
}
