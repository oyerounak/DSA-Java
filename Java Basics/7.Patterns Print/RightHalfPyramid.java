public class RightHalfPyramid {
    public static void main(String[] args) {
        /*
        Inverted Triangle
                 * 
               * *
             * * *
           * * * *
         * * * * *
        
         */
        int n =5;
        int i,j;
        for(i=n;i>=1;i--){ //outer loop to go to next line

            for(j=1;j<i;j++){ //inner loop to print space
                System.out.print(" ");
            }
            for (j=0;j<=n-i;j++) {
                System.out.print("*");//inner loop to print *
                
            }
            System.out.println();
        }

        //or
        
        int a=1;
        while(a<=n){
            int b=1;
            while(b<=(n-a)){
                System.out.print(" ");
                b++;
            }
            while(b<=n){
                System.out.print("*");
                b++;
            }
            System.out.println();
            a++;
        }

    }
    
}
