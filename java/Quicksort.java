import java.util.Random;

public class Quicksort {
    
    public void quicksort(int[] arr){
        quicksort(arr, 0, arr.length-1);
    }

    private void quicksort(int[] arr, int bot, int top){
        if(bot >= top){ // Si es un array de longitud 1 -> return
            return;
        }

        // 1. Elegir el pivote
        int pivotIndex = new Random().nextInt(top - bot) + bot;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, top);

        // 2. Hacer la partición
        int leftPointer = bot;
        int rightPointer = top;

        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, top);

        // 3. Ordenar recursivamente
        quicksort(arr, bot, leftPointer-1); // Ordenar la parte izquierda
        quicksort(arr, leftPointer+1, top); // Ordenar la parte derecha
    }

    private void swap(int[] arr, int index1, int index2){
        int aux = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = aux;
    }
}