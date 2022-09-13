import math

def solution(A, B, V):
    day = 1
    day += math.ceil((V-A) / (A - B))
    print(day)

A, B, V = map(int, input().split())
solution(A, B, V)
