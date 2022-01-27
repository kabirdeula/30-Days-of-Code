N = int(input())

sum, max = 0, 0

while N > 0:
    if N % 2 == 1:
        sum += 1
        if sum > max:
            max = sum

    else:
        sum = 0

    N //= 2

print(max)