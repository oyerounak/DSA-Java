//This program will help you understand claerly about static and instance variable.
public class StaticVsInstance {
    public static int staticVar = 0; // Static variable
    public int instanceVar = 0; // Instance variable
    
    public StaticVsInstance() {
        // Constructor increments both staticVar and instanceVar
        staticVar++;
        instanceVar++;
    }
    
    public static void main(String[] args) {
        StaticVsInstance obj1 = new StaticVsInstance();
        StaticVsInstance obj2 = new StaticVsInstance();
        StaticVsInstance obj3 = new StaticVsInstance();
        
        // Accessing staticVar through the class name
        System.out.println("Static variable value(via class name): " + StaticVsInstance.staticVar); 
        //Output : 3 (because there are three object of class StaticVsInstance and as we know we can have one copy of static variable per class)
        
        // Accessing staticVar through an object (not recommended)
       System.out.println("Static variable value(via obj1): " + obj1.staticVar);
        
        //Accessing instanceVar through obj1 and obj2
        System.out.println("Instance variable value(obj1): " + obj1.instanceVar); //output : 1 (Each object will have its own copy of instance variable)
        System.out.println("Instance variable value(obj2): " + obj2.instanceVar); //output : 1
        System.out.println("Instance variable value(obj3): " + obj3.instanceVar); //output : 1

        }
    
}
