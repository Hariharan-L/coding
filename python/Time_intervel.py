a=[[1,2],[2,10],[4,6],[7,9]]
a.sort(key=lambda x:x[1])
s,e=a[0]
c=1
for i,j in a: 
  if i<=e:
    print(i,j)
    continue
  else:
    s,e=i,j
    c+=1
print(c)