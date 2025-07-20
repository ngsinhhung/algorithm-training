"""
https://www.hackerrank.com/challenges/array-left-rotation/problem
"""

import time


def rotateLeftSolution1(d, arr):
    for i in range(d):
        temp = arr[0]
        for i in range(len(arr)):
            if i == len(arr) - 1:
                arr[i] = temp
                break
            arr[i] = arr[i+1]
            
    return arr

# Worst case: 0(n^2)


def rotateLeftSolution2(d, arr):
    if d == len(arr):
        return arr
    return arr[d:] + arr[:d] #O(1)

start = time.time()
print(rotateLeftSolution1(4, [1,2,3,4,5]))
end = time.time()
print(f"Execution time solution 1: {end - start:.4f} seconds")

start = time.time()
print(rotateLeftSolution2(4, [1,2,3,4,5]))
end = time.time()
print(f"Execution time solution 2: {end - start:.4f} seconds")