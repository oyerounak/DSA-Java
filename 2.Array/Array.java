import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int [] arr1 = new int[] {101,91,74,82,85};  //initializing an array Type 1
		//It is used for creating array as per required.
		
		int arr2[] = {10,9,8,736,872};  //Initializing an array Type 2
				
		//This will print Garbage Value
		System.out.println(arr1); 
		System.out.println(arr2); 
		
		//This will print Arrays in Array Formate
		System.out.println(Arrays.toString(arr1)); 
		System.out.println(Arrays.toString(arr2));
		
		//This will print all the values of all the array 
		for(int i =0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");

		}



    }
}
