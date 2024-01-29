public class FindPeak {

static int searchElement(int[] arr){
    int peak = 0;
    for(int i = 1; i<arr.length-1;i++){
        if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
            peak = arr[i];
        }
    }
    return peak;
}
    static int searchUsingBinarySearch(int[] arr){
        int start = 0;
        int end = arr.length -1;
        int mid = 0;
        while(start <=end){
            mid = start + (end-start)/2;
            if(mid==0) break;
            else if(mid > 0 && arr[mid-1]>arr[mid]) end = mid-1;
            else start = mid+1;
        }
        return mid;
    }
    public static void main(String[] args) {
       int[] arr = {1,0,3,10,2,11,1,1};
       int res = searchElement(arr);
//        int res = searchUsingBinarySearch(arr);
       System.out.println(res);

    }
}
