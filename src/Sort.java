import java.lang.reflect.Array;

public class Sort {

    public void insertionSort(int[] arr){
        for(int j=1;j<arr.length;j++){
            int key = arr[j];
            int i=j-1;
            while(i>=0 && arr[i]>key){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
    }

    public void displayArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public  static void main(String[] args){
        int[] arr = {10, 20, 40, 1, 20, 80, 5};
        Sort s = new Sort();
        s.displayArray(arr);
        s.insertionSort(arr);
        s.displayArray(arr);
    }
}
