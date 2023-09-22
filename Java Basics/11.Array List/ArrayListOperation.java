import java.util.ArrayList;

public class ArrayListOperation {
    //ArrayList in java is an Implementation of Dynamic Sized Array wit lots of libraries function
    //ArrayList cannot be implemented using primitive data type.
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(5); //We can initialize capacity here and use it like normmal arrays
        //which will have lots of functions
        al.ensureCapacity(50);//ensureCapacity doesn't change the logical size of an ArrayList - 
        //it changes the capacity, which is the size the list can reach before it next needs to copy values.

        al.add(10);
        al.add(20);
        al.add(30); //add function bydefault add elements at last

        System.out.println(al);
        for (int i = 0; i < 50; i++) {
            al.add(i);
        }
        System.out.println(al);
        System.out.println(al.size());
        
    }
}
