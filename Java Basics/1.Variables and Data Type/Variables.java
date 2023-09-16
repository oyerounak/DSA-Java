public class Variables {
    public static void main(String[] args) {
        
        // Accessing Static variable witout object. Creating an object of Article is not mandatory for static variable access.
        Article.rating = 4;
        System.out.println(Article.name + " rating:" + Article.rating);

        // In java instance variables are associated with objects (instances) of a class.
        // Instance Variable can be accessed only by creating objects.
        //First object
        Article obj1 = new Article();
        obj1.engMarks = 50;
        obj1.mathsMarks = 80;
        // second object
        Article obj2 = new Article();
        obj2.engMarks = 80;
        obj2.mathsMarks = 60;

        System.out.println("Marks for first object");
        System.out.println(obj1.engMarks);
        System.out.println(obj1.mathsMarks);
        System.out.println("Marks for second object");
        System.out.println(obj2.engMarks);
        System.out.println(obj2.mathsMarks);

    }

}

class Article {
    // Static variable Example
    public static int rating; //public static variable //we can use access specifiers if we want to.
    static String name = "Variables Declaration"; //Default Static variable

    // Instance Variable Example
    public int engMarks; // Public instance variable //We can use access specifiers for instance variables
    int mathsMarks; // Default (package-private) instance variable
}

/*Instance vs Static variable
1. Each object will have its (own copy) of instance variable whereas We can only have (one copy) of a static variable per class irrespective
of how many objects we create.
2. Changes made in an instance variable using one object will (not be reflected) in other objects as each object has its own copy of
instance variable. In case of static variable, changes (will be reflected) in other objects as static variables are common to all object of a
class. 
3. We can access instance variables (through object references) and Static Variables can be accessed (directly using class name).
*/