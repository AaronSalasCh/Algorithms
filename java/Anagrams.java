public class Anagrams {
    
    private boolean areAnagrams(String text1, String text2){
        text1 = text1.replace(" ", "").toLowerCase();
        text2 = text2.replace(" ", "").toLowerCase();

        if (text1.length() != text2.length()){
            return false;
        }

        int[] frecuencias = new int[26];

        for(int i=0; i<text1.length(); i++){
            frecuencias[text1.charAt(i) - 'a']++;
            frecuencias[text2.charAt(i) - 'a']--;
        }

        for (int fr : frecuencias) {
            if(fr != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String text1 = "Salas";
        String text2 = "asass";

        Anagrams anagrams = new Anagrams();
        System.out.println(anagrams.areAnagrams(text1, text2));
    }
}