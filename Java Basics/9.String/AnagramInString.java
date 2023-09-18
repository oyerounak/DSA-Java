public class AnagramInString{
    public static void main(String[] args) {

        //Find the minimum number of characters to be deleted to make both the strings anagram
        String s ="bcadeh"; //we need to delete 3 from here
        String s1 = "hear"; //and 1 from here

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count the frequency of characters in the first string
        for (char c : s.toCharArray()) {
            freq1[c - 'a']++;
        }

        // Count the frequency of characters in the second string
        for (char c : s1.toCharArray()) {
            freq2[c - 'a']++;
        }

        int delete = 0;

        // Calculate the difference in character frequencies
        for (int i = 0; i < 26; i++) {
            delete += Math.abs(freq1[i] - freq2[i]);
        }

        System.out.println(delete);
          
    }
}