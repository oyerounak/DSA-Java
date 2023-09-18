public class DigitsAfterDecimal {
    public static void main(String[] args) {
        String str = "0.65432";
        int pos = str.indexOf(".");
        if(pos<0){
            System.out.println(false);
        }
        else{
            System.out.println(str.substring(pos+1));
        }
    }
    
}
