public class Sort012 {
    public static void main(String[] args){
        int[] arr = {2,1,2,0,1,0,1,2,1,0}; // [0,0,0,1,1,1,1,2,2,2]
        int count0 = 0, count1 = 0, count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0) count0++;
            else if (arr[i] == 1) count1++;
        }
        count = count0 + count1;
        for(int i =0; i<count0; i++){
            arr[i] = 0;
        }
        for(int i= count0; i<count; i++){
            arr[i] = 1;
        }
        for(int i=count; i<arr.length; i++){
            arr[i] =2;
        }

        for(int i =0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
//alternate method nahi bujhaya