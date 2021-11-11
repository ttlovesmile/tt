# 【问题描述】

#  具有下面性质的数a称为"同构数"：设b是a的平方，a与b的低若干位相同。例如，5是25的同构数,25是625的同构数.编程序满足如下要求:
#  输入两个整数a,b (0<=a, b<=99),找出a、b之间全部的同构数。
# 【输入形式】

#  控制台输入0-99之间的两个整数a和b.
# 【输出形式】

# 控制台上按照由小到大的顺序输出所有同构数.每一个整数占一行.
# 【样例输入】

# 0 30
# 【样例输出】

# 0
# 1
# 5
# 6
# 25
# 【样例说明】

# 在0-30之间的同构数有0, 1, 5, 6, 25.


def number_of_isomorphism(f, g):
    list1 = []
    for i in range(f, g + 1):
        x = str(i ** 2)
        y = str(i)
        z = len(y)
        flag = True
        for j in range(-1, -z - 1, -1):
            if x[j] != y[j]:
                flag = False

        if flag:
            list1.append(i)
    return list1


a, b = map(int, input().split(' '))
print(*map(int, number_of_isomorphism(a, b)), sep='\n')
