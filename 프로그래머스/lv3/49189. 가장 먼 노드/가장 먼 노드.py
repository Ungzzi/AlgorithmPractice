from collections import deque


def solution(n, edge):
    q = deque()
    graph = [[]for _ in range(n+1)]
    visited = [-1 for _ in range(n+1)]
    visited[1] = 0

    for i in edge:
        graph[i[0]].append(i[1])
        graph[i[1]].append(i[0])

    q.append(1)
    while q:
        cur = q.popleft()

        for i in graph[cur]:
            if visited[i] == -1:
                visited[i] = visited[cur] + 1
                q.append(i)

    return visited.count(max(visited))