import java.io.*;

public class BufferredReader {
    public static void main(String[] args)throws IOException{
        
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
       
        System.out.println("Enter a String : " );

        //String Reading using Bufferred Reader
        String name = br.readLine();
        System.out.println(name);
        
        System.out.println("Enter a int number : ");

        //Integer type Reading using Bufferred Reader
        int a = Integer.parseInt(br.readLine());
        System.out.println(a);

        //Long type Reading using Bufferred Reader
        System.out.println("Enter a long number : ");
        long x = Long.parseLong(br.readLine());
        System.out.println(x);

        //Float type Reading 
        System.out.println("Enter a float number : ");
        float b = Float.parseFloat(br.readLine());
        System.out.println(b);

        //Character type Reading
        System.out.println("Enter a chararcter : ");
        char c = (char)br.read();
        System.out.println(c);

        //File Reading
        try{
        FileReader fr=new FileReader("C:\\Java Basics\\Input and Output\\file1.txt"); //File Path
        BufferedReader br1=new BufferedReader(fr);    
          String st;
          while((st=br1.readLine())!=null){  
          System.out.println(st);  
          }
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found by system: " + e.getMessage());
        }


    }
    
}
