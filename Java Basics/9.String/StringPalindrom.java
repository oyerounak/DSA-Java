public class StringPalindrom {
    public static void main(String[] args) {
        String s1 = "abba"; //"abcba"

        int start = 0;
        int end = s1.length()-1;
        boolean isPalin = true;
        while(start<end){
            if(s1.charAt(start)!=s1.charAt(end)){
                isPalin=false;
                break;
            }
            start++;end--;
        }

        if(isPalin==true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


    }
    
}
