a,b=map(int,input().split())
l=[]
count=0
for i in range(a):
  l[i]=list(map(int,input().split()))
def sample(n ,m):
  if(n>=0 and m>=0 and n<=a and m<=a):
    if(l[n][m]==1):
      sample(n,m+1)
      sample(n,m-1)
      sample(n+1,m)
      sample(n-1,m)
for i in range(a):
  for j in range(a):
    l[i][j]