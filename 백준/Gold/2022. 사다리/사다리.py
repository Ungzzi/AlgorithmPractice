import sys

x, y, c = map(float, sys.stdin.readline().split())

start = 0
end = min(x, y)


def getC(w, x, y):
    h1 = (x**2-w**2)**0.5
    h2 = (y**2-w**2)**0.5
    c = h1*h2/(h1+h2)
    return c


while start < end - 0.000001:
    mid = (start + end)/2

    if getC(mid, x, y) >= c:
        start = mid
    else:
        end = mid
print(mid)