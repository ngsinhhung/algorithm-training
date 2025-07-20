"""
O(log n) - logarithmic time complexity
The runtime increases logarithmically as the input size increases.
"""

# Binary Search in sorted Array
a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

tagert = 6
l, r = 0, len(a) - 1
while l <= r:
    mid = (l + r) / 2
    if tagert < a[mid]:
        r = mid
    elif tagert > a[mid]:
        l = mid
    else:
        print(mid)
        break

#Binary Search on Binary Search Tree

