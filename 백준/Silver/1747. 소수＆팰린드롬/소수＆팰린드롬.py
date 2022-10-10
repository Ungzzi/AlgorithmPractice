import sys
max_n = 1000000
n = int(sys.stdin.readline())
flag = False

a = [True] * (max_n + 1)
a[0], a[1] = False, False
m = int(max_n**0.5)

for i in range(2, m + 1):
    if a[i] == True:
        for j in range(i + i, max_n + 1, i):
            a[j] = False

for i in range(n, max_n+1):
    if a[i] == True:
        c = str(i)
        if len(c) == 1:
            print(c)
            flag = True
            break
        elif c[:len(c)//2] == c[len(c)-1:len(c)-len(c)//2-1:-1]:
            print(c)
            flag = True
            break

if flag == False:
    print(1003001)