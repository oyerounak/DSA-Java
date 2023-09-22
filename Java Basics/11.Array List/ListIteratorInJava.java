import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorInJava {
    public static void main(String[] args) {
        //we can use remove function while traversing through the list by using iterator

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(50);
        al.add(4,40);
        System.out.println(al);
        ListIterator<Integer> li = al.listIterator();
        while(li.hasNext()){
            int x = (Integer)li.next();
            if(x==50){
                li.remove();
            }
            else{
                System.out.println(x);
            }

        }
        
    }
    
}
