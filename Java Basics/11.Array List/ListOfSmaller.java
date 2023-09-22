import java.util.ArrayList;

public class ListOfSmaller {
    public static void main(String[] args) {
        // Conversion of array to arrayList
        int arr[] = {1,2,3,4,5,6,7};
        int k=4;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                al.add(arr[i]);
            }
        }
        System.out.println(al+" "+al.size());

        
    }
    
}
