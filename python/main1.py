import random

from Quicksort import Quicksort

arr = []

for _ in range(10):
    arr.append(int(random.random() * 100))

print(f'Antes: {arr}')

sort = Quicksort()
sort.quicksort(arr, 0, len(arr)-1)

print(f'Despues: {arr}')