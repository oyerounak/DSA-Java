import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = 10;

        // Type 1
        if(n==0){
            System.out.println("Zero");
        }
        else if(n%2==0){
            if(n>0){
                System.out.println("Positive Even");
            }
            else{
                System.out.println("Negative Even");
            }
        }
        else{
            if(n>0){
                System.out.println("Positive ODD");
            }
            else{
                System.out.println("Negative ODD");
            }
        }
        
        // Type 2
        if(n>0){
            System.out.print("Positive ");
            if(n%2==0){
                System.out.print("Even\n");
            }
            else{
                System.out.print("Odd\n");
            }

        }
        else if(n<0){
            System.out.print("Negative ");
            if(n%2==0){
                System.out.print("Even\n");
            }
            else{
                System.out.println("Odd\n");
            }
        }
        else{
            System.out.println("Zero");
        }
        
    }
    
}
