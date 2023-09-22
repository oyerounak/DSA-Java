import java.util.Arrays;

public class Conversion {
    public static void main(String[] args) {

        //Char array to String
        char[] ch = {'a', 'e', 'i', 'o', 'u'};
        String st = String.valueOf(ch); //Aproach 1
        String st2 = new String(ch); //Aproach 2

        System.out.println(st);
        System.out.println(st2);

        //String to char array
        String st1 = "This is great";
        char[] chars = st1.toCharArray();
        System.out.println(Arrays.toString(chars));

        //Convert char to String
        char ch1 ='a';
        String s1 = Character.toString(ch1);
        System.out.println(s1);

        String text = "Java is a fun programming language";
        
        // split string from space
        String[] result = text.split(" ");
        
        System.out.print("result = ");
        for (String str : result) {
            System.out.print(str + ", ");
        }
    }
}
