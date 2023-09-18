public class SearchPattern {
    public static void main(String[] args) {
        String text = "java for java";
        String pat = "java";

        int pos = text.indexOf(pat);
        while(pos>=0){
            System.out.print(pos+" ");
            pos = text.indexOf(pat, pos+1); 
        }

    }
    
}
