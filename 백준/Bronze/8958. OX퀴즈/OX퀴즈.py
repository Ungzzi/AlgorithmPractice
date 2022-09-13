def solve(result):
    cnt = 0
    sum = 0

    for c in result:
        if c == "O":
            cnt += 1
            sum += cnt
        else:
            cnt = 0
    return sum


n = int(input())
for i in range(n):
    x = input()
    print(solve(x))
