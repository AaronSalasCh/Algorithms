import java.util.ArrayDeque;
import java.util.Deque;

public class Parentheses{

    public boolean isValid(String txt){
        if(txt.length() % 2 != 0){ // Si la longitud es impar, es imposible que sea válido
            return false;
        }

        Deque<Character> pila = new ArrayDeque<>();

        for (char c : txt.toCharArray()) {
            if(c == '('){ // Es de apertura
                pila.push(')');
            }else if(c == '['){ // Es de apertura
                pila.push(']');
            }else if(c == '{'){ // Es de apertura
                pila.push('}');
            }else if(pila.isEmpty() || pila.pop() != c){ // Es de cierre ')', ']', '}'
                return false;
            }
        }
        
        // Si está vacía -> Todo valido
        // Si NO está vacía -> Hay algun error
        return pila.isEmpty(); 
    }

    public static void main(String[] args) {
        Parentheses paren = new Parentheses();

        String txt = "(((([[[[{{{{{{}}}}}}]]]]))))";

        System.out.println(paren.isValid(txt));
    }
}