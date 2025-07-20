def dynamicArray(n, queries):
    arr = [[] for i in range(n)]
    lastAnswer = 0
    resultArr = []

    for i in range(len(queries)):
        [type, x, y] = queries[i]
        idx = (x ^ lastAnswer) % n
        print(idx)
        if type == 1:
            arr[idx].append(y)
        elif type == 2:
            lastAnswer = arr[idx][y%len(arr[idx])]
            resultArr.append(lastAnswer)
    return resultArr
    
dynamicArray(2, [[1,0,5],[1,1,7],[1,0,3],[2,1,0],[2,1,1]])


    
    
