def fuc2(p, q):
    while p != q:
        if p > q:
            p = p - q
        else:
            q = q - p

    return p


a, b = map(int, input().split(' '))
print(fuc2(a, b), int(fuc2(a, b)*a/fuc2(a, b)*b/fuc2(a, b)))
