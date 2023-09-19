public class OddEven {
	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6,7,8};
		
		//Printing original Array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");

		}
		System.out.println();
		
		//Printing Even elements of Array
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		
		//Printing odd elements of Array
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}

}
