//Factorial of number (https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Mathematics/problem/factorial-of-number)

import java.util.*;
class Main {
    public static void main(String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

            //creating an object of class Factorial
            Solution obj = new Solution();
            int N;
            
            //taking N
            N = sc.nextInt();
            
            //calling factorial() method 
            //of class Factorial
            System.out.println(obj.factorial(N));
            sc.close();
        
    }
}

class Solution { 
    //Recursive Solution (Optimal) 
    
    public long factorial(int N) { 
        if(N==0){ 
            return 1; 
        } 

        return N*factorial(N-1);
    }
}