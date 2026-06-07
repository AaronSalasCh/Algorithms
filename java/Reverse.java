public class Reverse {

    public String reverse(String text){
        if(text == null || text.isEmpty()){
            return "";
        }
        
        char[] chars = text.toCharArray();

        int punteroBot = 0;
        int punteroTop = chars.length - 1;

        while (punteroBot < punteroTop) {
            swap(chars, punteroBot, punteroTop);
            punteroBot++;
            punteroTop--;
        }

        return new String(chars);
    }
    
    private void swap(char[] chars, int index1, int index2){
        char aux = chars[index1];
        chars[index1] = chars[index2];
        chars[index2] = aux;
    }

    public static void main(String[] args) {
        Reverse inverter = new Reverse();
        
        String text = "Deben obedecer";
        System.out.println(text);

        String textReversed = inverter.reverse(text);

        System.out.println(textReversed);
    }
}