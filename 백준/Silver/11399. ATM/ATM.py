pSum = 0

# print("인원 수를 입력하시오.")
N = int(input())
# print("각 사람이 돈을 인출하는데 걸리는 시간을 입력하세요")
P = input()
P = P.split()
P = [int(i) for i in P]
P.sort()

for i in range(N):
    for j in range(i+1):
        pSum += P[j]

print(pSum)
