from Quicksort import Quicksort

def kthLargest1(arr, k):
    for _ in range(k-1):
        arr.remove(max(arr))
    return max(arr)

def kthLargest2(arr, k):
    arr.sort()
    return arr[len(arr) - k]

def kthLargest3(arr, k):
    sort = Quicksort()
    sort.quicksort(arr, 0, len(arr)-1)
    return arr[len(arr) - k]
    
arr = [2, 24, 8 ,12, 43, 12, 2, 9, 74, 32, 8, 12, 0, 9, 3]
k = 4

print(kthLargest3(arr, k))