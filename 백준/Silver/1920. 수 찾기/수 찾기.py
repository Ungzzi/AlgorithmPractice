N = int(input())
list_N = list(map(int, input().split(' ')))
list_N.sort()


M = int(input())
list_M = list(map(int, input().split(' ')))


def binary(target):
    start = 0
    end = N - 1

    while start <= end:
        mid = (start + end) // 2
        if target == list_N[mid]:
            return True
        elif target < list_N[mid]:
            end = mid - 1
        elif target > list_N[mid]:
            start = mid + 1


for i in range(M):
    if binary(list_M[i]):
        print(1)
    else:
        print(0)