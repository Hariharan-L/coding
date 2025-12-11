n=int(input())
l=""
while(n>0):
  a=n%2
  n=n//2
  l=l+str(a)
l=l[::-1]
print(l)
