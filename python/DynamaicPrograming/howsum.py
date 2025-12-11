memo={}
def howsum(n,arr,memo):
  if(n in memo): 
    return memo[n]
  if(n==0):
    return []
  if(n<0):
    return None
  for i in arr:
    rem=n-i
    remresult=howsum(rem,arr,memo)
    if(remresult!=None):
      memo[n]=[*remresult,i]
      # print(memo[n])
      return memo[n]
  memo[n]=None
  return None

print(howsum(7,[2,3],memo))
print(howsum(3446,[14,7],memo))