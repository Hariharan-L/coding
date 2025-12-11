a=int(input())
for i in range(1,a+1):
  n=1
  while(n<=i):
    print(n,end="")
    n+=1
  n=n-1
  while(n!=1):
    n-=1
    print(n,end="")
    # n-=1
  print()
  