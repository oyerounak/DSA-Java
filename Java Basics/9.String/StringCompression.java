//Easy String - https://practice.geeksforgeeks.org/problems/easy-string2212/1
public class StringCompression {
    public static void main(String[] args) {
        /*
         * for eg Input : aaabbbbddeeeee
         * Output : a3b4d2e5
         * for eg Input : abc
         * Output : abc
         * 
         */

        String str = "aabbccc";
        System.out.println(Compress(str));
        System.out.println(Compress1(str));
    }

    // Approach 1
    public static String Compress(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1; // As we have to convert int to String and it is possible with Integer wrapper
                               // Class.
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            str1 = str1 + str.charAt(i);
            if (count > 1) {
                str1 = str1 + count.toString();
            }

        }
        return str1;
    }

    // Approach 2 (Efficient Solution)
    public static String Compress1(String str) {

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1; // As we have to convert int to String and it is possible with Integer wrapper
                               // Class.
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }

        }
        return sb.toString();

    }
}
