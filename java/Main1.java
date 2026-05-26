import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[25];

        for (int i=0; i<arr.length; i++){
            arr[i] = rand.nextInt(100);
        }

        System.out.print("Before: ");
        printArray(arr);

        Quicksort sort = new Quicksort();
        sort.quicksort(arr);

        System.out.print("After: ");
        printArray(arr);       
    }

    private static void printArray(int[] arr){
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}