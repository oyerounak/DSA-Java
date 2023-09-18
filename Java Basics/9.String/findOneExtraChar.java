import java.util.Arrays;

public class findOneExtraChar {
    public static void main(String[] args) {
        String s = "abcd"; 
        String t="abecd";

        //Type 1
        char[] a = s.toCharArray();
        Arrays.sort(a);
        
        char[] b = t.toCharArray();
        Arrays.sort(b);
        
        for(int i=0;i<s.length();i++){
            
            if(b[i] != a[i]){
                System.out.print(b[i]+" ");
            }
        }
        System.out.println(b[t.length()-1]);

        //Most Efficient
        int res =0;
        int n =s.length();
        for (int i = 0; i < n; i++){
            res = res^s.charAt(i)^t.charAt(i);
        }
        res = res^t.charAt(n);
        System.out.println((char)res);
    }
    
}
