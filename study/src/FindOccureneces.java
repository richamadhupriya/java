public class FindOccureneces {
    static int searchElement(int[] arr, int key){
        int count = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == key) count++;
        }
        return count;
    }

        public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,1,1,1};
       int res = searchElement(arr, 1);
        System.out.println(res);

    }
}
