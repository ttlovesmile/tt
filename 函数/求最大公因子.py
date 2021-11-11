# 【问题描述】
#
# 用递归方法编写求最大公因子程序。两个正整数x和y的最大公因子定义为：如果y<=x且x mod y＝0时，gcd(x,y)=y;如果y>x时，gcd(x,y)=gcd(y,x);其他情况，gcd(x,y)=gcd(y,x mod y)
# 【输入形式】
#
# 用户在第一行输入两个数字，数字之间用空格分割。
# 【输出形式】
#
# 程序在下一行输出前面输入的两个数字的最大公因子。
# 【样例输入】
#
# 36 24
# 【样例输出】
#
# 12
# 【样例说明】
#
# 用户输入36，24，程序输出它们的最大公因子12
def gcd(max, min):

    if max % min == 0:
        return min

    return gcd(min, max % min)


x, y = map(int, input().split(' '))
print(gcd(x, y))