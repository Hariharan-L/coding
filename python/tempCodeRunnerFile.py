a=int(input())
n=""
while a!=0:
  t=a%2
  n=str(t)+n
  a=a//2
print(n)
count=0
for i in range(len(n)):
  if(n[i]=="1"):
    count+=1
print(count)