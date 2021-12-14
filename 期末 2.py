#编写一个程序，接收用户输入的一个字符串(可以包含空格)，统计其中所有出现过的所有字符，并按照频率高低的顺序排列输出。频率相同的字符按输入顺序输出。
#【输入形式】

#户在第一行输入一个字符串，以回车结束输入。
#【输出形式】

#程序统计字符串中出现的所有字符，然后按照字符出现频率大小排序输出，频率相同时，按输入顺序输出。输出形式规定为每行输出4个字符数据，
#输出格式为：字符-出现次数。每个字符-出现次数输出中间用一个空格分隔，每行末尾没有空格。程序输出结尾有一个回车。
s = input()

my_dict = {}

for i in s:
    my_dict[i] = my_dict.get(i, 0)+1

print(my_dict)

for index, item in enumerate(sorted(my_dict.items(), key=lambda x: x[-1], reverse=True), start=1):
    print(f'{item[0]}-{item[1]}', end='{}'.format(' ' if index % 4 else '\n'))

