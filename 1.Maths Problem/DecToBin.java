// Decimal to Binary - https://practice.geeksforgeeks.org/problems/decimal-to-binary-1587115620/1
public class DecToBin {
    public static void main(String[] args) {

        toBinary(233);
        //Or Simply use 
        String n =Integer.toBinaryString(233);
        System.out.println(n);
        
    }
    public static void toBinary(int N) {
		int n =N;
		int pow =0;
		int binNum=0;
		while(n>0){
		    int rem = n%2; //reminder
		    binNum = binNum + rem * (int)Math.pow(10,pow);
		    pow++;
		    n=n/2; //quotient
		}
		System.out.print(binNum);
		
	}
    
}
