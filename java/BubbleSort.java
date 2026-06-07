public class BubbleSort{

    private void bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int o=0; o<arr.length-1-i; o++){
                if(arr[o] > arr[o+1]){
                    swap(arr, o, o+1);
                }
            }
        }
    }

    private void swap(int[] arr, int index1, int index2){
        int aux = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = aux;
    }

    private void printArr(int[] arr){
        for (int num : arr) {
            System.out.print(num+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] arr = {-9, -3, 9, -32, 2, 10, -22, 12, 0, 30};

        BubbleSort sort = new BubbleSort();
        sort.printArr(arr);
        sort.bubbleSort(arr);
        sort.printArr(arr);
    }
}