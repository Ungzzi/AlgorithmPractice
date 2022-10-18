import sys

while True:
    li = list(map(int, sys.stdin.readline().split()))
    max_n = max(li)
    if sum(li) == 0:
        break
    li.remove(max_n)
    if li[0] ** 2 + li[1] ** 2 == max_n ** 2:
        print('right')
    else:
        print('wrong')
