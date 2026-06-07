import java.util.stream.IntStream;

public class FizzBuzz {

    private String[] fizzBuzz(int n){
        String[] ans = new String[n];
        
        for(int i=1; i<=n; i++){
            StringBuilder sb = new StringBuilder();
            
            if (i % 3 == 0) sb.append("Fizz");
            if (i % 5 == 0) sb.append("Buzz");
            if (sb.isEmpty()) sb.append(i);
            
            ans[i-1] = sb.toString();
        }
        
        return ans;
    }

    private String[] fizzBuzzGod(int n){
        return IntStream.rangeClosed(1, n)
            .mapToObj(i -> {
                StringBuilder sb = new StringBuilder();
                if (i % 3 == 0) sb.append("Fizz");
                if (i % 5 == 0) sb.append("Buzz");
                if (sb.isEmpty()) sb.append(i);
                return sb.toString();
            }).toArray(String[]::new); // Recolecta y convierte a String[] mágicamente
    }

    private void printArr(String[] arr){
        for (String str : arr) {
            System.out.print(str+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        FizzBuzz fizz = new FizzBuzz();
        
        String[] ans1 = fizz.fizzBuzz(30);
        String[] ans2 = fizz.fizzBuzzGod(30);

        fizz.printArr(ans1);
        fizz.printArr(ans2);
    }
}