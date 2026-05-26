import java.util.Arrays;

public class KthLargest {
    
    private int find_greater(Integer[] arr){
        int greater = -99999999;
        int res = 0;
        int o = 0;

        for (Integer num : arr) {
            if (num == null){
                o++;
                continue;
            }
            
            if (num > greater){
                greater = num;
                res = o;
            }
            
            o++;
        }

        return res;
    }

    // Encontrar el numero mas grande y removerlo k-1 veces, encontrarlo una ultima vez y retornarlo
    private int kthLargest1(Integer[] arr, int k){
        int res;

        for (int i=0; i<k-1; i++){
            res = find_greater(arr);            
            arr[res] = null;
        }
        res = find_greater(arr);            

        return arr[res];
    }

    private int kthLargest2(Integer[] arr, int k){
        int[] arrInt = Arrays.stream(arr)
                        .mapToInt(i -> (i == null) ? 0 : i)
                        .toArray();

        Quicksort sort = new Quicksort();
        sort.quicksort(arrInt);
        
        return arrInt[arrInt.length - k];
    }

    public static void main(String[] args){
        KthLargest kth = new KthLargest();
        
        Integer[] arr = {2, 24, 8 ,12, 43, 12, 2, 9, 74, 32, 8, 12, 0, 9, 3};
        int k = 4;
        
        // System.out.println(kth.kthLargest1(arr, k));
        System.out.println(kth.kthLargest2(arr, k));
    }
}