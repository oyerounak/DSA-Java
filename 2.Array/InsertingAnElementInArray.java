import java.util.Arrays;

public class InsertingAnElementInArray {
    public static void main(String[] args){
        //Time Complexity = O(n)
		
		//Initializing an Array
		int arr[] = {1,2,4,5,6,7,8,9};
		
		//Getting the length of Array
		int length = arr.length;
		
		//Value to be Inserted
		int x = 3;

		//Position of the Value in Array
		int pos = 3;
		
		//Calling the Function
		InsertX(x,arr,length,pos);

    }
    
    public static int[] InsertX(int x , int arr[], int length , int pos) {
		int i;
		
		//Creating array of Bigger size then the first array.
		int arr1[] = new int[length+1];
		
		
		for (i = 0; i < length+1; i++) {
			
			//jab tak i small hai 3(pos) se , tab arr array ki elements copy hongi arr1 array mai
			if(i<pos-1) {
				arr1[i]=arr[i];
			}
			// jab i barabar hoo jayega 3(pos), tab uss position pr x ki value add hoo jayegi.
			else if(i==pos-1) {
				arr1[i]=x;
			}
			// otherwise arr1 mai copy hoote rahenge rest of the values.
			else {
				arr1[i]=arr[i-1];
			}
			

		}
		System.out.println(Arrays.toString(arr1));
		return arr1;


	}
    

}
