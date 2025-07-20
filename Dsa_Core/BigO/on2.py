"""
O(n^2) - Quadratic Time 
Runtime grows with square at the input
Basic algorithm: Bubble sort
For nested loop
"""

a = [[1,2,3], [4,5,6], [8,9,10]]
for i in range(len(a)):
    print(a[i])
    for j in range(len(a[i])):
        print(a[i][j])
