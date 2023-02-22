def solution(n, results):
    answer = 0
    graph = [[0] * n for _ in range(n)]
    for x, y in results:
        graph[x-1][y-1] = 1
    for i in range(n):
        for j in range(n):
            for k in range(n):
                if (graph[j][i] == 1 and graph[i][k]):
                    graph[j][k] = 1
    print(graph)
    return answer