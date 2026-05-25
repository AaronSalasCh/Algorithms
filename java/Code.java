public class Code {
    
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

    // Encontrar el numero mas grande y removerlo k-1 veces
    private int kthLargest(Integer[] arr, int k){
        int res;

        for (int i=0; i < k-1; i++){
            res = find_greater(arr);            
            arr[res] = null;
        }
        res = find_greater(arr);            

        return arr[res];
    }

    public static void main(String[] args){
        Code code = new Code();
        
        Integer[] arr = {2, 24, 8 ,12, 43, 12, 2, 9, 74, 32, 8, 12, 0, 9, 3};
        int k = 4;
        
        System.out.println(code.kthLargest(arr, k));
    }
}