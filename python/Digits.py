class Digits:
    
    def sum_digits(self, number):
        if number is None:
            return None
        
        number = abs(number)
        
        suma = 0
        while number > 0:
            suma += int(number % 10)
            number = int(number / 10)

        return suma
    
digit = Digits()
res = digit.sum_digits(12345)
print(res)