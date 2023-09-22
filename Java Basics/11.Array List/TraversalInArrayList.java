import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraversalInArrayList {
    public static void main(String[] args) {

        // Forward Traversal
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(50);

        // Approach 1(not much used)
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println();

        // Approach 2(using for each loop)
        for (int i : al) {
            System.out.println(i);
        }
        System.out.println();

        // Approach 3(using hasNext() and Iterator method)
        ListIterator<Integer> it = al.listIterator(); // or Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        //Approach 4
        // Printing numbers using lambda expressions
        al.forEach(x->System.out.println(x));

        System.out.println();

        // Backward Traversal
        ListIterator<Integer> it1 = al.listIterator(al.size());
        while (it1.hasPrevious()) {
            System.out.println(it1.previous());
        }

    }

}
