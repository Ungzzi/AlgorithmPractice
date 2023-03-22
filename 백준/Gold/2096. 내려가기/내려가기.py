import sys

input = sys.stdin.readline

N = int(input())
num = []

max_list = [[0]*3 for _ in range(2)]
min_list = [[0]*3 for _ in range(2)]

for i in range(N):
    num = list(map(int, input().split()))
    max_list[1][0] = max(max_list[0][0], max_list[0][1]) + num[0]
    min_list[1][0] = min(min_list[0][0], min_list[0][1]) + num[0]

    max_list[1][1] = max(max_list[0][0], max_list[0]
                         [1], max_list[0][2]) + num[1]
    min_list[1][1] = min(min_list[0][0], min_list[0]
                         [1], min_list[0][2]) + num[1]

    max_list[1][2] = max(max_list[0][1], max_list[0][2]) + num[2]
    min_list[1][2] = min(min_list[0][1], min_list[0][2]) + num[2]

    max_list[0][0], max_list[0][1], max_list[0][2] = max_list[1][0], max_list[1][1], max_list[1][2]
    min_list[0][0], min_list[0][1], min_list[0][2] = min_list[1][0], min_list[1][1], min_list[1][2]

print(max(max_list[0]), min(min_list[0]))