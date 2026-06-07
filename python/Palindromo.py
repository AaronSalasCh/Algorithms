class Palindromo:
    
    def isPalindromo(self, text):
        if text is None:
            return False
        
        text = str.lower(text)
        
        puntero_izq = 0
        puntero_der = len(text) - 1
        
        while puntero_izq < puntero_der:
            if text[puntero_izq] != text[puntero_der]:
                return False
            
            puntero_izq += 1
            puntero_der -= 1
        
        return True
        
palindromo = Palindromo()
print(palindromo.isPalindromo("Salas"))
print(palindromo.isPalindromo("Aaron"))
print(palindromo.isPalindromo("anA"))
print(palindromo.isPalindromo("ana"))
print(palindromo.isPalindromo("reconocer"))
print(palindromo.isPalindromo("recOnoCeR"))
print(palindromo.isPalindromo("recOnoCesR"))