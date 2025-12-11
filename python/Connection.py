ele=[34,7,91,911,1,20,10]
le=[]
for i in ele:
  le.append(str(i))

def doublenum(x):
  print(x*2)
  return x*2
le.sort(key=doublenum,reverse=1)
print(le)
print(int("".join(le)))