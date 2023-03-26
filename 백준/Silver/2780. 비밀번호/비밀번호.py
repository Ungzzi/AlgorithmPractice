import copy

T = int(input())
for _ in range(T):
    dp = [1 for _ in range(10)]
    n = int(input())

    for i in range(1, n):
        tmp = copy.deepcopy(dp)
        dp[0] = tmp[7]
        dp[1] = tmp[2] + tmp[4]
        dp[2] = tmp[1] + tmp[3] + tmp[5]
        dp[3] = tmp[2] + tmp[6]
        dp[4] = tmp[1] + tmp[5] + tmp[7]
        dp[5] = tmp[2] + tmp[4] + tmp[6] + tmp[8]
        dp[6] = tmp[3] + tmp[5] + tmp[9]
        dp[7] = tmp[4] + tmp[8] + tmp[0]
        dp[8] = tmp[5] + tmp[7] + tmp[9]
        dp[9] = tmp[6] + tmp[8]

    print(sum(dp)%1234567)
