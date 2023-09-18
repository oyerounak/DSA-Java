import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        /*Anangram - Every character of string 1 must be in string 2 
        and length of string 1 should be equal to length of string 2
        and frequency of character in string 1 equals to string 2.
        for eg: s1="listen" s2 ="silent" output =yes
        s1 ="aab" s2 ="baa" output =yes 
        */
        String s = "bac";
        String s1="cab";

        boolean check = CheckAnagram(s,s1);
        System.out.println(check);
    }
    public static boolean CheckAnagram(String s, String s1){
        if(s.length()!=s1.length()){
            return false;
        }
        char a[] =s.toCharArray();
        Arrays.sort(a);
        s=new String(a);

        char b[] =s.toCharArray();
        Arrays.sort(b);
        s1=new String(b);

        // for(int i=0;i<a.length;i++){
        //     if(a[i]!=b[i]){
        //         return false;

        //     }
        // }
        // return true;

        //OR

        return s.equals(s1);


    }
    
}
