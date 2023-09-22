import java.util.ArrayList;
public class MethodsInArraylist {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        //add(object) method
        al.add("Please");
        al.add("God");
        al.add("God");
        al.add("Help");
        al.add("Me");
        al.add("Out");
        //add(index,object) method
        al.add(5,"request");

        System.out.println(al);
        //size of Arraylist method - return int value
        System.out.println(al.size());
        //contains(object) method - return boolean value
        System.out.println(al.contains("God"));
        //remove(object) method - return boolean value if availabe true else false
        System.out.println(al.remove("me"));
        // remove(index) method - return object at that specific index
        System.out.println(al.remove(3));
        System.out.println(al);
        // get(index) method - return object at that index
        System.out.println(al.get(1));
        //set(index,object) - change the value of object at that index 
        System.out.println(al.set(3, "help"));
        System.out.println(al);
        //indexOf(object) - return the first index of the object
        System.out.println(al.indexOf("God"));
        //LastIndexOf(object) - return the last index of the object(Note that if we search an item not present in arraylist will return -1x)
        System.out.println(al.lastIndexOf("God"));
        //clear() - Empty the ArrayList
        al.clear();
        //isEmpty() - return boolean value (true if empty else false)
        System.out.println(al.isEmpty());
        System.out.println(al);


    }
    
}
