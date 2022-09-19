from collections import deque

def solution(array, commands):
    commands = deque(commands)
    answer = []

    while commands:
        sp = commands[0][0] - 1
        ep = commands[0][1]
        arr = sorted(array[sp:ep])
        answer.append((arr[commands[0][2]-1]))
        commands.popleft()
    return answer