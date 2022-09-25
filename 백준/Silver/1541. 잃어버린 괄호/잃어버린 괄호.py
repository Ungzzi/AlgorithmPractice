import re
import sys

op = sys.stdin.readline().rsplit()[0]
op = re.split('([-|+])', op)
minus = False
sum = 0

for i in op:
    if i == '-':
        minus = True
    elif i == '+' and minus == True:
        continue
    elif i == '+':
        minus = False
    elif minus == True:
        sum -= int(i)
    else:
        sum += int(i)

print(sum)