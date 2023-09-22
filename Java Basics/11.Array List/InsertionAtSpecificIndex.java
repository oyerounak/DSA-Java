import java.util.ArrayList;

public class InsertionAtSpecificIndex {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Sweet");
        al.add("Candy");
        al.add("Happy");
        System.out.println(al);
        al.add(2,"Stay"); 
        /*Note:
        Index will be from 0 to size of arraylist, if index greater than size
        then it will throw IndexOutOfBoundsException
        */
        System.out.println(al);
    }
    
}
