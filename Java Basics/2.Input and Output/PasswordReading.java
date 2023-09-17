import java.io.Console;
import java.util.Arrays;

public class PasswordReading {
    public static void main(String[] args) {
        // Console Class to read password
        Console console = System.console();
        
        System.out.println("Reading input from console using Console in Java6 ");
        System.out.println("Please enter your input: ");
        String input = console.readLine();
        System.out.println("User Input from console: " + input);
        //password will not be echoed to console and stored in char arraygwd6
        System.out.println("Reading password from Console in Java: "); 
        
        char[] password = console.readPassword();
        System.out.println("Password entered by user: " + new String(password));
        Arrays.fill(password,' '); // Clear the password from memory for security reasons
    }
    
}
