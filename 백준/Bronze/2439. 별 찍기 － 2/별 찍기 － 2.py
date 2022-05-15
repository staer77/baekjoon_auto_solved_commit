import sys
s = int(sys.stdin.readline())

for i in range(1, s+1):
    star = '*'*(i)
    print(star.rjust(s))