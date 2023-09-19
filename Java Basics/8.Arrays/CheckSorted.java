public class CheckSorted {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 5, 7, 7 };

        boolean flag = true;
        if(arr.length==0 || arr==null){
            flag = true;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag=false;
            }
        }
        System.out.println(flag);
        
    }
    
}
