import java.util.Arrays;

public class MergingTwoArrays {
	public static void main(String[] args) {
		//Time Complexity = o(N+M)
		
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {6,7,8,9};
		int arr3[] = {0};
		int a = arr1.length;
		int b = arr2.length;
		int c = arr3.length;
		
		int arr4 [] = new int[a+b+c];
		
		for(int i=0;i<a;i++) {
			arr4[i]=arr1[i];
		}
		
		for(int i=0;i<b;i++) {
			arr4[a+i]=arr2[i];
		}
		
		for(int i=0;i<c;i++) {
			arr4[a+b+i]=arr3[i];
		}
		
		
		System.out.println(Arrays.toString(arr4));
	}

}
