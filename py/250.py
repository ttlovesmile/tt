import string

str1, str4 = input(), input()
str3 = []
for i in str1:
    if i not in str3:
        str3.append(i)
str2 = str3[::-1]
chars = []
for i in range(97, 123):
    chars.append(chr(i))
chars1 = chars[::-1]
for i in chars1:
    if i not in str2:
        str2.append(i)
table = ''.maketrans(string.ascii_lowercase, ''.join(str2))
print(str4.translate(table))
