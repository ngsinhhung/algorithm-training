"""
O(2^n) - Exponential Time
Runtimes doubles with each addtitional element
"""

def fib(num):
    if num <= 1:
        return num
    return fib(num-1) + fib(num-2)

print(fib(5))