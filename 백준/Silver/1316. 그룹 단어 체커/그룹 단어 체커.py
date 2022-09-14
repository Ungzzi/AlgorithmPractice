import sys

n = int(sys.stdin.readline())
cnt = 0

for j in range(n):
    arr = input()
    li = []
    li.append(arr[0])

    if len(arr) <= 2:
        cnt += 1
        continue

    checker = True
    
    for i in range(1, len(arr)):
        if arr[i-1] == arr[i]:
            li.append(arr[i])
            continue
        elif (arr[i-1] != arr[i]) and (arr[i] in li):
            checker = False
            break
        else:
            li.append(arr[i])
    if checker == True:
        cnt += 1
print(cnt)
