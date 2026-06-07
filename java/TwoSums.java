import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    private int[] twoSums(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();

        int comp;

        for(int i=0; i<arr.length; i++){
            comp = target - arr[i];

            // Revisamos si ya existe el complemento en el mapa
            if(map.containsKey(comp)){
                return new int[] {map.get(comp), i};
            }

            // Si no guardamos el numero
            map.put(arr[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSums sums = new TwoSums();
        
        int[] arr = {2, 7, 11, 15};
        int target = 18;

        int[] ans = sums.twoSums(arr, target);
        System.out.println(ans[0]+" "+ans[1]);
    }
}