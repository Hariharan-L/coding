from collections import Counter
a=[1,1,1,1,1,2,2,3,3,3,3,4,5,6,7,8,8,8,8,0]
# a=input()
# a=a[::-1]
# for i in a:
#   l=ord(i)
#   p=l+25
#   m=p-90
#   print(chr(90-m),end="")
# print(float("infinity"))
c=Counter(a)
print(c)