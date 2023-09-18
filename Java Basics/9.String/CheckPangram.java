import java.util.Scanner;

public class CheckPangram {
    public static void main(String[] args) {
        //A string is called pangram if it contain all the characters from A-Z either apper in upper or lower case
        // for eg- input: "the Quick brown fox jumps over a lazy dog"
        //Output : true

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean res = pangram(str);
        if(res==true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static boolean pangram(String str){
        int n = str.length();
        if(n<25){
            return false;
        }
        boolean visited[] = new boolean[26];
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                visited[ch-'a']=true;
            }
            if(ch>='A' && ch<='Z'){
                visited[ch-'A']=true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if(visited[i]==false) 
                return false;
        }
        return true;

    }
    
}
