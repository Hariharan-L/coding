s="program"
l=len(s)
for j in range(l):
  for i in range(l):
    if (i==j):
      print(s[i],end="")
    elif(i+j==l-1):
      print(s[i],end="")
    else:
      print(" ",end="")
  print()
