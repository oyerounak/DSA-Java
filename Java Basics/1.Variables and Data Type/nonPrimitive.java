import java.io.IOException;

class nonPrimitive {
    public static void main(String[] args) throws IOException{
        
        Point p = new Point();
        p.x = 100;
        p.y = 200;

        Point p1 =new Point();

        Point p2 = p;
        p2.x = 30;

        System.out.println(p.x);
        System.out.println(p2.x);
        //Output for both will be 30 because non-primitive type variables are reference class

        System.out.println(p1.x);
        System.out.println(p1.y);
        //both output will be 0 because member of non primitive data type get default value.



    }
    
}
class Point{
    int x,y; //Member of Non-Primitive data type.
}
