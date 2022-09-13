def solve(a):
    answer = 0
    for i in range(1, a+1):
        if i < 100:
            answer += 1
        elif (i//100 - i % 100//10 == i % 100//10 - i % 10):
            answer += 1
    return answer


x = int(input())
print(solve(x))