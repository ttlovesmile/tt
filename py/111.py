a,b = input().split()
c = int(a[::-1])
d = int(b[::-1])
a = int(a)
b = int(b)
if a*b == c*d:
    print(a,'*',b,'=',c,'*',d,sep= '')
else:
    print(a,'*',b,'!=',c,'*',d,sep= '')



