def solve(a):
    sum = 0
    a = str(a)
    for n in a:
        sum += int(n)
    sum += int(a)
    return sum


L1 = []
L2 = []

for i in range(1, 10000):
    L1.append(solve(i))

for i in range(1, 10000):
    L2.append(i)

answer = [x for x in L2 if x not in L1]
for n in answer:
    print(n)