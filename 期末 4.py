n = int(input())
lst = []
for i in range(n):
    lst.append(int(input()))

print(max(lst, key=lst.count))
