a = [1,4, 3, 2]

def Solution(a):
    l = 0
    r = len(a) - 1
    mid = (l + r) / 2
    while (l < mid) and (r > mid):
        a[l], a[r] = a[r], a[l]
        l += 1
        r -= 1
    
    print(a)
    return

Solution(a)