a=["apple","berry","mapple","reach","goosberry","strawberry","peach","google","blackberry"]
# l=[]
# for i in a:
#   if i not in l:
#     l.append(i)
#     le=len(i)
#     for j in a:
#       if j.endswith(i[le-2:le]) and j not in l:
#         l.append(j)
# print(l)
#**********************************One line function**************************
def strsort(x):
  return x[::-1]
a.sort(key=strsort)
print(a)
b="a ai e rtr hari whats happening hwree then we can need noooooo  output"
b=b.split(" ")
b.sort(key=len)
print(" ".join(b))