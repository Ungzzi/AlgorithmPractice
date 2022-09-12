def solution(clothes):
    hash_table = {}
    answer = 1

    for _, cloth in clothes:
        if cloth in hash_table:
            hash_table[cloth] += 1
        else:
            hash_table[cloth] = 2

    for num in hash_table.values():
        answer *= num

    return answer - 1