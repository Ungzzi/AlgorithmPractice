from collections import deque

def solution(prices):
    answer = []
    for i in range(len(prices)):
        cnt = 0
        low_price = prices[i]
        for j in range(i+1, len(prices)):
            cnt += 1
            if low_price <= prices[j]:
                continue
            else:
                break
        answer.append(cnt)
    return answer