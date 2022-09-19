def solution(sizes):
    answer = 0

    listA = []
    listB = []

    for size in sizes:
        listA.append(max(size))
        listB.append(min(size))
    answer = max(listA) * max(listB)

    return answer