import java.util.Arrays;

public class RemovingDuplicates {
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;
        
        //If the arrays are not in sorted form.
        Arrays.sort(arr);

        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];
        // Changing original array  
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }  
       
    public static void main (String[] args) {  
        int arr[] = {1,1,2,2,3,4,4,5,5,1,2,5};  
        int length = arr.length;  
        int Original = removeDuplicateElements(arr, length);  
        //printing array elements
        
        for (int i=0; i<Original; i++)  
           System.out.print(arr[i]+" ");  
    }

}
