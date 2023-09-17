//Factorial of number (https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Mathematics/problem/factorial-of-number)

import java.util.*;
public class FactorialOfNumber{
    public static void main(String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        int N;
            
        //taking N
        N = sc.nextInt();
            
        //calling factorialOfN() method 
        //of class Solution
        System.out.println(factorialOfN(N));
        
    }

    //Recursive Solution (Optimal) 
    public static long factorialOfN(int N) { 
        if(N==0){ 
            return 1; 
        }

        return N*factorialOfN(N-1);
    }
}
