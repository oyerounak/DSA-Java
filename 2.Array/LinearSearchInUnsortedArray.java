public class LinearSearchInUnsortedArray {

    public static void main(String[] args){

        int arr[] = {10, 9 ,5, 3,5, 6,4,334,556};
        int length = arr.length;
        int x = 5;
        int output = Search(arr , x , length);
        System.out.println(x+" is found at "+output);



    }

    static int Search(int arr[], int x , int length){
        
        for(int i=0;i<length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;

    }
    
}
