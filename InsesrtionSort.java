public class InsesrtionSort {
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            // finding out thr correct position to insert
            while(j >=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            //insertion
            arr[j+1] = key;
        }
    }

    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        //printArr(arr);
    }
}
