def fac(n1):
    sum = 1
    for i in range(1, n1 + 1):
        sum *= i
    return sum


n = int(input())
print(fac(n))
