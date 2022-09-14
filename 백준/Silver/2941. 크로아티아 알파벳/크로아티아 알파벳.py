import sys

arr = sys.stdin.readline()
li = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

for c in li:
    arr = arr.replace(c, 'T')

print(len(arr)-1)