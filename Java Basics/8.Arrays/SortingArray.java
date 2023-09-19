import java.util.Arrays;
import java.util.Collections;

public class SortingArray {
	//Space Complexity = O(1)
	public static void main(String[] args) {
		
		///Giving the array data type as Integer to import reverse order.
		Integer arr1[] = {72,56,60,68,72,77,71,70,84,88,67,76}; 
		
		System.out.println("Sorting from a specific index 2 to 7.");
		Arrays.sort(arr1,2,7);   
		//Printing
		System.out.println(Arrays.toString(arr1));
		
		
		System.out.println("Ascending Order using Sort Function - Type 1");
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println("Ascending Order By Using Loop - Type 2");
		int num=0;
		//Time Complexity = O(n^2)
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=i+1;j<arr1.length;j++) {
					if(arr1[i]>arr1[j]) {
						num=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=num;
					}
				}
			}
		
		System.out.println(Arrays.toString(arr1));
			
		System.out.println("Descending order Using Collections.reverseOrder() - Type 1");
		Arrays.sort(arr1,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("Descending Order By Using Loop - Type 2");
		int temp=0;
		//Time Complexity = O(n^2)
			for(int i=0;i<arr1.length;i++) {
				for(int j=i+1;j<arr1.length;j++) {
					if(arr1[i]<arr1[j]) {
						temp=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=temp;
					}
				}
			}
		System.out.println(Arrays.toString(arr1));
		
		
		
		
	}

}
