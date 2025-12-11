memo={}
def cansum(n,arr,memo):
  if(n in memo): 
    return memo[n]
  if(n==0):
    return True
  if(n<0):
    return False
  for i in arr:
    rem=n-i
    if(cansum(rem,arr,memo)==True):
      memo[n]=True
      # print(memo[n])
      return True
  memo[n]=False
  return False
print(cansum(7,[2,3],memo))
print(cansum(7,[2,4],memo))
print(cansum(14,[1,2,3,4],memo))
print(cansum(300,[14,7],memo))