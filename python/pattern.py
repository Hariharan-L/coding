a=int(input())
for i in range(1,a+1):
  k=a-i
  for j in range(1,i+1):
    while(k!=0):
      print(" ",end="")
      k-=1
    print("*",end="")
  print()
  