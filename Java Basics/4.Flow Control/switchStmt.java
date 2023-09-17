import java.util.Scanner;

public class switchStmt {
    public static void main(String[] args) {
        //Example
        Scanner sc =new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char c =Character.toUpperCase(ch);

        int x=0,y=0;
        switch(c){
            case 'L':x--;System.out.println(x);break;
            case 'R':x++;System.out.println(x);break;
            case 'U':y++;System.out.println(y);break;
            case 'D':y--;System.out.println(y);break;
            default: System.out.println("Invalid");
        }
    }
    
}
