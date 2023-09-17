public class MethodsInJava {
    public static void main(String[] args) {
        System.out.println("Main Start");
        function1();
        System.out.println("Main ends");

    }
    public static void function1(){
        System.out.println("Function 1 starts");

        //Accessing the non-static method
        MethodsInJava abc = new MethodsInJava(); //Creating Instance of the class.
        abc.function2(); //calling the non-static method on the instance.
        System.out.println("Function 2 ends");
    }
    public void function2(){ //This is a non-static method
        System.out.println("Inside function 2");

    }
    //All the function works like a stack of function. 
    //when a function is called that function is added to the function call stack.
    //And After the execution the function is called out of the stack.
    
}
