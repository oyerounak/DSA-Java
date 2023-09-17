public class SquareStar {

    public static void main(String[] args) {
        /*
    
         * * * * *  1 2 3 4 5   1 1 1 1 1
         * * * * *  1 2 3 4 5   2 2 2 2 2
         * * * * *  1 2 3 4 5   3 3 3 3 3
         * * * * *  1 2 3 4 5   4 4 4 4 4
         * * * * *  1 2 3 4 5   5 5 5 5 5
        
         */

         int n = 5;
         int i;
         for(i=1;i<=n;i++){ //i is for row
            int j=1;
            for(j=1;j<=n;j++){ //j is for column
                System.out.print("* "); //Replace * with j will print 2nd pattern AND Replace * with i will print 3rd pattern.
            }
            System.out.println();

         }

    }
    
}
