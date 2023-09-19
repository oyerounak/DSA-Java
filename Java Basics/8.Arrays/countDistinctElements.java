public class countDistinctElements {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 5, 7, 7 };
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            boolean isdistinct = true;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    isdistinct = false;
                    break;
                }
            }
            if (isdistinct == true)
                count++;
        }
        System.out.println(count);
    }

}
