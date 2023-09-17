public class PassingParameter {
    public static void main(String[] args) {

        Variables v = new Variables(); //creating object
        Variables.a = 5;
        v.b=7; v.c =8; //Updating Values of a, b and c 
        func(v); //arguments or actual parameters.
        func2(); //we have passed nothing in func2() but it will still keep the updated value of variable a.
        System.out.println(v.a+"  "+v.b+"  "+v.c); //Here we can see that v.a it will not produce any error
        //but will show error in compiler to access the variable in a static way
        //Output : 123  7  8
        
    }
    public static void func(Variables v){ //Instead of v we can use whatever name we want to give. //Parameter or Formal Parameter
        v = new Variables(); //This will create a new object 
        Variables.a =9;
        v.b =10; v.c=12;
        System.out.println(Variables.a+"  "+v.b+"  "+v.c); //Output : 9  10 12
        // As we have created new object of variable here the variable will not update the values in main because that is not the same object. 

    }
    public static void func2(){
        Variables.a= 123;
        System.out.println(Variables.a); //Output: 123
    }
    
}
class Variables{
    public static int a; //Static variable and it has only one copy
    public int b; //Instance variable
    int c; //Local variable
}
//If you understood the difference between Static vs Instance in Java it will be easy for you to guess the output of these kind of programs.