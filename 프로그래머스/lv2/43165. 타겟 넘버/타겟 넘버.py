cnt = 0

def dfs(i, v, n, t):
    global cnt 
    if i == len(n):
        if v == t:
            cnt+= 1
        return 
    
    dfs(i+1, v + n[i], n, t)
    dfs(i+1, v - n[i], n, t)


def solution(numbers, target):
    global cnt
    dfs(0,0, numbers, target)
    
    return cnt