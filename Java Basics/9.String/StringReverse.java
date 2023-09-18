public class StringReverse {
    public static void main(String[] args) {
        String str ="Hello Buddy";
        int end = str.length()-1;
        for(end=str.length()-1;end>=0;end--){
            System.out.print(str.charAt(end));

        }
        //or
        
        System.out.println();
        String str1 = "Hello Everyone";
        String s2 = "";
        int end1 =str1.length()-1;
        while(end1>=0){
            s2 =s2 + str1.charAt(end1);
            end1--;
        }
        System.out.println(s2);
    }
    
}
