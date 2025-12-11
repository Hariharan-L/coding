a,b=map(int,input().split())
i=1
def lcm(n,m,i):
  if n%m==0:
    return n
  else:
    n=n//i
    i=i+1
    return lcm(n*i,m,i)
print(lcm(a,b,i))