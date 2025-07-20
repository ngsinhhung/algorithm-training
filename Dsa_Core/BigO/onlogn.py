"""
O(nlogn) -> linearithmic time

"""

a = [1,2,3,4,5,6,7]
import heapq
heapq.heapify(a) # iterate all over element for transform list to heap 

while a:
    print("Before pop: ", a)
    heapq.heappop(a) # logn
    print("After pop: ", a)


