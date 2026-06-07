import java.util.Arrays;

public class Common {
    
    public String prefix(String[] arr){
        if(arr == null || arr.length == 0){
            return "";
        }

        // Tomamos la primera palabra completa como nuestro "prefijo candidato"
        String prefix = arr[0];

        for(int i=1; i<arr.length; i++){

            // Mientras que no sea un prefijo válido
            while (arr[i].indexOf(prefix) != 0) {
                // Recortamos la última letra del prefijo y volvemos a intentar
                prefix = prefix.substring(0, prefix.length()-1);

                // Si lo recortamos hasta dejarlo vacío, no hay coincidencias
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }

        return prefix;
    }

    public String prefix2(String[] arr){
        if(arr == null || arr.length == 0){
            return "";
        }

        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length - 1];

        int i = 0;
        while (i < first.length() && i < last.length()) {
            if(first.charAt(i) == last.charAt(i)){
                i++;
                continue;
            }
            break;
        }

        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String[] arr = {"anatomia", "anaxagoras", "anacleto", "anaximander", "ana", "anabolico", "anastasio", "anastasia", "analgesico", "analitico", "analitica", "anahi"};

        Common common = new Common();

        System.out.println(common.prefix2(arr));
    }
}