a = [1,2,3]

print(sum(a))

for i in a:
    print(i)

a.insert(1,100) #insert in middle
print(a)

import heapq
heapq.heapify(a) # iterate all over element for transform list to heap 

