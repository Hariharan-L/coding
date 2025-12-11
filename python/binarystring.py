a=input()#1000111111
k=""
i=len(a)-1
while(i>=0):
  if(a[i]=="0"):
    j=1
    k=a[i]+k
    flag=0
    while(i-j>=0 and a[i-j]=="1"):
      # k=a[i]+k
      flag=1
      j+=1
    if(flag==1):
      i-=j
    else:
      # k=a[i]+k
      i-=1
  else:
    k=a[i]+k
    i-=1
print(k)