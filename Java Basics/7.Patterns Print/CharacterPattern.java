public class CharacterPattern {
    public static void main(String[] args) {
/*
A
BC
DEF
GHIJ
KLMNO
 */
        int n =5;
        char ch ='A';
        for(int line=1;line<=n;line++){ //outer loop

            for(int chars=1;chars<=line;chars++){ //Inner loop to print characters
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }
    }
    
}
