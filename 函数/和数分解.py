# 【问题描述】
#
# 由数学基本定理可知：任何一个大于1的非素数整数（即合数）都可以唯一分解成若干个素数的乘积。编写程序，
# 从控制台读入一个合数（合数的大小不会超过int数据类型表示的范围），求这个合数可以分解成的素数。
#
# 【输入形式】
#
# 从控制台输入一个合数。
#
# 【输出形式】
#
# 在标准输出上按照由小到大的顺序输出分解成的素数，各素数之间以一个空格分隔，最后一个整数后也可以有一个空格。
#
# 【输入样例】
#
# 12308760
# 【输出样例】
#
# 2 2 2 3 3 3 3 5 29 131
def divisors(number):
    list = []
    i = 2
    while i <= number:
        if number % i == 0:
            list.append(i)
            number //= i
            i = 2
            continue
        i += 1
    return list


Sum_Numbers = int(input())
print(*map(int, divisors(Sum_Numbers)), sep=' ')
