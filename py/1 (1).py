dict1={'a':12,'e':3,'f':8,'d':4}
list1= sorted(dict1.items(),key=lambda x:x[1])
print(list1)