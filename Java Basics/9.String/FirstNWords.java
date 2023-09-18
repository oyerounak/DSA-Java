
public class FirstNWords {
    public static void main(String[] args) {
        String s = "hello everyone how are you today?";
        int k=4;
        String str =truncateSentance(s,k);
        System.out.println(str);
    }

    public static String truncateSentance(String s,int k){
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ') count++;
            if(count == k) 
                return s.substring(0,i);
        }
        return s;
    }
}
