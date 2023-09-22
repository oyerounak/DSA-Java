public class Upper {
    public static void main(String[] args) {
        String str ="hi, i am raunak raj ";
        System.out.println(toUpper(str));
        
    }
    public static String toUpper(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){ //case for empty space and last character is space
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))); //returning upper case character nad appending it in sb
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }
    
}
