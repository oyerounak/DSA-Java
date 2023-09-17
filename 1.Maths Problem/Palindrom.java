public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom(14241));
    }

    public static boolean isPalindrom(int n) {
        int a = n;
        int temp = 0;
        while (a > 0) {
            temp = (temp * 10) + a % 10;
            a = a / 10;
        }
        if (temp == n) {
            return true;
        } else {
            return false;
        }
    }

}
