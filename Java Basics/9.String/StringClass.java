import java.util.Objects;

public class StringClass{
    public static void main(String[] args) {
/*

 * This String class create Immutable String(a sequence of characters) 
 * i.e, content of string cannot be changed and has fixed length.

 */
        // Creating a String And operations
        String str = "raunak"; 
        System.out.println(str.length()); //output : 6
        System.out.println(str.charAt(2));  //output :u
        System.out.println(str.substring(2));  //output : unak  (substring(startIndex,endIndex+1)) 
        System.out.println(str.substring(2,5));  //output : una

        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 ="Hello";
        System.out.println(s1==s2); //output : false (because we are refering here to a new object.)
        System.out.println(s1==s3);  //output : true
        System.out.println(s1.equals(s2));  //output :true

        String str3 = "geeksforgeeks";
        String str4 = "geeks";
        String str5 = "for";
        System.out.println(str3.indexOf(str4)); //output : 0
        System.out.println(str3.indexOf(str4, 2)); //output : 8
        System.out.println(str3.indexOf(str5, 0)); //output : 5
        System.out.println(str3.contains(str4)); //output : true

        String s4 ="geeksforgeeks";
        String s5 ="for"; 
//Here 'f' comes before 'g' so res will be positive 
//If it will be "hell" then 'h' comes after 'g' so res will be negative
        int res = s4.compareTo(s5);
        if(res==0) System.out.println("same");
        if(res>0) System.out.println("S4 is greater"); //This wil be executed
        if(res<0) System.out.println("S4 is Smaller");

        String a = "Raunak";
        String b = "RAUNak";
        System.out.println(a.equalsIgnoreCase(b)); //output : true
        System.out.println(Objects.equals(a, b));  //output : false

        String c = new String("Hello");
        String d = new String("Hello");
        System.out.println(Objects.equals(c,d)); //output : true

        String str6 = "Geeks";
        String str7 = str6;
        str6 = str6 + "ForGeeks"; // Or str6 = str6.concat("ForGeeks");
        System.out.println(str6); // output = GeeksForGeeks
        System.out.println(str6 == str7); // output : false
        //But wait above we saw that string is Immutable ! How is this possible ?
        //Yes , So String object is immutable, its reference variable is not.

        System.out.println(s4.toUpperCase()); //output : GEEKSFORGEEKS
        //Capitalize first letter
        String str8 = "java";
        String cap = str8.substring(0, 1).toUpperCase() + str8.substring(1);
        System.out.println(cap);//Output : Java
        
        String str9 ="oyerounak";
        str9.concat(str9+" is my insta Id.");
        System.out.println(str9); //output : oyerounak
        /*
        The first line is pretty straightforward: create a new String "java" and refer s1 to it.
        Next, the VM creates another new String "java rules", but nothing refers to it. 
        So, the second String is instantly lost. We can't reach it.
        Now the Question is So, where do these String objects go?
Well, these exist in memory, and one of the key goals of any programming language is to make efficient use of memory.
That's the reason that the String class is marked 'final' so that nobody can override the behavior of its methods.
*/
        String str10 = "acacaabacaa acacabb";
        str10 = str10.replaceAll("ac", "");
        str10 = str10.replaceAll("b", "");
        System.out.println(str10);




    }
}