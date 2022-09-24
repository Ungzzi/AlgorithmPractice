def solution(brown, yellow):
    answer = []
    w = 3
    h = (brown + yellow) // w
    area = brown + yellow
    while (w * h) != (brown + yellow) or yellow != (w-2)*(h-2) or brown != (w+h) * 2 - 4:
        w += 1
        h = (brown + yellow) // w

    answer = [max(w, h), min(w, h)]
    return answer
