import random
n=10000
l = [random.randint(1,10000)for i in range(n)]
# for i in range(n):
#   for j in range(i,n):
#     if(l[i]>l[j]):
#       l[i],l[j]=l[j],l[i]
l=sorted(l)
print(l)