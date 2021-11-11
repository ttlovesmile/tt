# 【问题描述】胡德现在有很多事要做，但事情具有不同的优先级。
#
# 为了能即使高效的完成手上的任务，胡德给任务分了三种优先级A，B，C其中A的优先级最高，C的优先级最低，现在请你帮胡德排出一个合理的事情完成顺序。
# 【输入形式】
#
# 第一行输入一个数字N，表示一共有N个任务。接下来N行，每行输入一个数字表示任务ID和一个字母表示任务优先级，中间用空格隔开
# 【输出形式】
#
# 任务ID的执行顺序
# 【样例输入】
#
# 4
# 1 C
# 2 B
# 3 C
# 4 A
# 【样例输出】

# 1 C
# 2 B
# 3 C
# 4 A
#
# 4
# 2
# 1
# 3
def hood_mission(n):
    for i in range(0, n):
        task, priority = input().split(' ')
        dict[task] = priority
    # sorted(dict)
    dict1 = sorted(dict.items(), key=lambda item: item[1], reverse=False)
    for i in range(0, len(dict1)):
        print(dict1[i][0])
    return 0


n = int(input())
dict = {}
hood_mission(n)
