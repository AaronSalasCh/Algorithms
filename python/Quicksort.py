import random

class Quicksort:
    
    def quicksort(self, arr, bot, top):
        if(bot >= top): # Si es un array de longitud 1 -> return
            return
        
        # 1. Elegir el pivotes
        pivot_index = random.randrange(bot, top)
        pivot = arr[pivot_index]
        self.swap(arr, pivot_index, top)
        
        # 2. Hacer la partición
        left_pointer = bot
        right_pointer = top
        while(left_pointer < right_pointer):
            while(arr[left_pointer] <= pivot and left_pointer < right_pointer):
                left_pointer += 1
            
            while(arr[right_pointer] >= pivot and left_pointer < right_pointer):
                right_pointer -= 1
                
            self.swap(arr, left_pointer, right_pointer)
        self.swap(arr, left_pointer, top)
        
        # 3. Ordenar recursivamente
        self.quicksort(arr, bot, left_pointer-1)
        self.quicksort(arr, left_pointer+1, top)
                
    def swap(self, arr, index1, index2):
        aux = arr[index1]
        arr[index1] = arr[index2]
        arr[index2] = aux