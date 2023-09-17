public class ReturnInJava {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Before the return statement");
        if(t)
            return; //Compiler bypasses all the other stmt after return stamt.
        System.out.println("This won't execute");  //output : Before the return statement

        
    }
}
