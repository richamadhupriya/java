// https://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/
public class Segregate0and1 {
    static void segregate(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0) count++;
        }
        for(int i=0;i<count;i++){
            arr[i] = 0;
        }
        for(int i=count; i<arr.length; i++){
            arr[i] = 1;
        }

        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void segregateUsingPointers(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            if(arr[start] ==1){
                if(arr[end] == 0){
                    int x = arr[end];
                    arr[end]  = arr[start];
                    arr[start] = x;
                }
                end--;
            }else start++;
        }
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,0,1,0,1,1,1,0,0};
//        segregate(arr);

        segregateUsingPointers(arr);
    }
}
