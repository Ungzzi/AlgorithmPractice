from collections import deque


def solution(bridge_length, weight, truck_weights):
    time = 0
    sum = 0

    bridge = deque([0]*bridge_length)
    wait = deque(truck_weights)

    while wait:
        sum -= bridge[0]
        bridge.popleft()
        time += 1

        if ((sum + wait[0]) > weight):
            bridge.append(0)

        else:
            truck = wait.popleft()
            sum += truck
            bridge.append(truck)

    return time + bridge_length