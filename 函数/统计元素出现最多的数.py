def counting_integers(a1):
    i: object = max(a1, key=a1.count)
    return i


n = int(input(

))
a = []
for i in range(0, n):
    a.append(int(input()))
print(counting_integers(a))
