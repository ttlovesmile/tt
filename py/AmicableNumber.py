# [问题描述]
# 2500年前数学大师毕达哥拉斯就发现，220和284两数之间存在着奇妙的联系:
# 220的因数之和(除了自身之外的因数)为: 1+2+4+5+10+11+20+22+44+55+110=284, 284的因数之和为: 1+2+4+71+142=220。
# 毕达哥拉斯把这样的数对称为相亲数。输入两个正整数(大于1并且在int的表示范围之内) ,分别计算它们所有因数之和(除了自身之外的因数) ,并判断它们是否是一对相亲数。
# [输入形式]
# 从标准输入输入两个正整数，以一个空格分隔这两个正整数。
# [输出形式]
# 以输入的先后顺序分行输出:输入的正整数,后跟英文逗号","，再从1开始输出其因数相加的公式(最大的因数之后没有加号) ,最后输出英文等号"=”和因数之和。注意:
# 所有输出元素间无空格。
# 若它们是一对相亲数， 则在新的一行上输出1;若不是则在新的一行上输出0。
# [样例输入1]
# 220 284
# [样例输出1]
# 220,1+2+4+5+10+11+20+22+44+55+110=284
# 284,1+2+4+71+142=220
# 1
# [样例输入2]
# 2560 3282
# [样例输出2]
# 2560,1+2+4+5+8+10+16+20+32+40+64+80+128+160+256+320+512+640+1280=3578
# 3282,1+2+3+6+547+1094+1641=3294
# 0
# [样例说明]
# 样例1中输入的两个正整数为220和284，220的因数之和为284, 284的因数之和为220，所以它们是一对相亲数， 最后输出1;
# 例2中输入的两个正整数是2560和3282，2560的因数之 和为3578, 3282的因数之和为3294,所以它们不是一对相亲数, 最后输出0。
a, b = map(int, input().split())  # 输入
fa, fb = [i for i in range(1, a) if a % i == 0], [i for i in range(1, b) if b % i == 0]  # 找因数
sa, sb = sum(fa), sum(fb)  # 求和
print(a, ',', *map(lambda x: str(x) + '+', fa[:-1]), fa[-1], '=', sa, sep='')  # 输出
print(b, ',', *map(lambda x: str(x) + '+', fb[:-1]), fb[-1], '=', sb, sep='')  # 输出
print(1 if sa == b and sb == a else 0)  # 判断后输出

