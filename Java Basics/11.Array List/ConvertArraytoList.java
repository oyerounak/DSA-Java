import java.util.ArrayList;
import java.util.Collections;

public class ConvertArraytoList {
    public static void main(String[] args) {
        int arr[] = new int[]{1,5,2,3,9,2,6,7};
        ArrayList<Integer> li = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            li.add(arr[i]);
        }
        System.out.println(li);

        //Sort the arrayList
        Collections.sort(li);
        System.out.println(li);

        //Reverse the ArrayList
        Collections.reverse(li);
        System.out.println(li);

        //Sort in reverse order
        Collections.sort(li,Collections.reverseOrder());
        System.out.println(li);


}
    
}
