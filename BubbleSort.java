public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {2, 1, 4, 5, 6, 0};
        printArray(bubbleSort(array));
    }

    public static int[] bubbleSort(int arr[]) {
        int temp;

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }
}

