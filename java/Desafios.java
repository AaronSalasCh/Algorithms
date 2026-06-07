public class Desafios{

    private int digitsSum(int integer){
        int suma = 0;
        
        String integerStr = String.valueOf(Math.abs(integer));
        
        for(int i=0; i<integerStr.length(); i++){
            suma += Integer.parseInt(""+integerStr.charAt(i));
        }
        
        return suma;
    }

    private int digitsSum2(int integer){
        integer = Math.abs(integer);

        int suma = 0;

        while (integer > 0) {
            suma += integer % 10;
            integer /= 10;
        }

        return suma;    
    }

    private boolean isPalindrome(String inputStr){
        if(inputStr == null){
            return false;
        }
    
        // Para ignorar diferencias entre mayusculas y minusculas
        inputStr = inputStr.toLowerCase();

        int punteroBot = 0;
        int punteroTop = inputStr.length() - 1;

        while(punteroBot < punteroTop){

            // Si estos caracteres difieren aunque sea una vez ya no es palindromo
            if(inputStr.charAt(punteroBot) != inputStr.charAt(punteroTop)){
                return false;
            }

            punteroBot++;
            punteroTop--;
        }

        return true;
    }

    private int[] integerSort(int[] inputArray){
        int[] inputArrayCopy = inputArray.clone();

        QuickSort sort = new QuickSort();
        sort.quickSort(inputArrayCopy);

        return inputArrayCopy;
    }

    private void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        Desafios desafios = new Desafios();

        // Desafio 1. Suma de dígitos
        System.out.println(desafios.isPalindrome("aNa"));
        System.out.println(desafios.isPalindrome("juan"));
        System.out.println(desafios.isPalindrome("aNA"));
        System.out.println(desafios.isPalindrome("reconoCER"));
        System.out.println(desafios.isPalindrome("salas"));
        System.out.println(desafios.isPalindrome("prueba"));
        System.out.println(desafios.isPalindrome("SaLaS"));
        
        // Desafio 2. Palíndromos
        System.out.println(desafios.digitsSum(-12345));
        System.out.println(desafios.digitsSum2(-12345));
        
        // Desafio 2. Ordenamiento
        int[] arr = {5, -2, 10, 0, 3, -7, -10, -12, 21, 200, -200};

        desafios.printArray(arr);
        int[] newArr = desafios.integerSort(arr);
        desafios.printArray(newArr);
    }
}