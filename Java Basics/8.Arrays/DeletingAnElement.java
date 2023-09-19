import java.util.Arrays;
import java.util.Scanner;

public class DeletingAnElement {
	public static void main(String[] args) {
		//Time Complexity = O(n)
		
		
		int [] arr = {10,23,43,21,54,76};
		
		System.out.println("Original Array: "+Arrays.toString(arr));
		System.out.print("Enter the Index to Delete: ");
		Scanner sc = new Scanner(System.in);
		//getting the index value to delete
		int index = sc.nextInt();
		
		arr = RemovingElement(arr,index);
		System.out.println("Resulting Array: "+Arrays.toString(arr));
		sc.close();
		
	}
	
	
	public static int[] RemovingElement(int[] arr , int index) {
		
		// If the array is empty
		// or the index is not in array range
		// return the original array
		if(arr==null||index<0||index>=arr.length) {
			return arr;
		}
		
		//Creating another array of one size less
		int[] arr1 = new int[arr.length-1];
		
		
		//Copy the elements except the index value
		for(int i=0,k=0;i<arr.length;i++) {
			
			//if the index value = array index
			if(i==index) {
				continue;
			}
			//if the index is not the removal element index.
			arr1[k++]=arr[i];
		}
		return arr1;
		
	}

}
