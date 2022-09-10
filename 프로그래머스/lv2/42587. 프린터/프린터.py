from collections import deque


def solution(priorities, location):
    answer = 0
    priorities = deque(priorities)
    position = deque([i for i in range(len(priorities))])

    while priorities:
        most_priorities = 1
        index = 0

        for i in range(len(priorities)):
            if priorities[i] > most_priorities:
                most_priorities = priorities[i]
                index = i

        priorities.rotate(-index)
        priorities.popleft()
        position.rotate(-index)
        answer += 1

        if position.popleft() == location:
            return answer