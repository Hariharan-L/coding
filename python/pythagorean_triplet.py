count=0
n=int(input("Enter the range of triplet from 1 to :"))

for i in range(1,n+1):
  for j in range(i,n+1):
    for k in range(j,n+1):
      if (i**2 + j**2)==k**2:
        count+=1
        print(i,j,k)
print("Triplets found: ",count)