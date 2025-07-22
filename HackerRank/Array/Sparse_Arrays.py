"""
https://www.hackerrank.com/challenges/sparse-arrays/problem?isFullScreen=true
"""
def matchingStrings(stringList, queries):
    dict = {}
    for item in stringList:
        if dict.get(item) is None:
            dict[item] = 1
        else: 
            value = dict[item]
            dict[item] = value + 1
    
    return [ dict.get(item) if dict.get(item) is not None else 0 for item in queries]


rs = matchingStrings(["aba","baba","aba","xzxb"], ["aba","xzxb","ab"])
print(rs)
