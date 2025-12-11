def catalan(n):
  c=[]
  c.extend([1,1])
  for i in range(2,n+1):
    temp=0
    for j in range(i):
      temp+=c[i-j-1]*c[j]
    c.append(temp)
  print(c)
  return c[n]
m= catalan(5)

print(m)