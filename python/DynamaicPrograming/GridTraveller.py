memo={}
def grid_traveller(m,n,memo):
  key=str(m)+","+str(n)
  if(key in memo):
    return memo[key]
  if(m==0 or n==0):
    return 0
  if(m==1 and n==1):
    return 1
  memo[key] = grid_traveller(m-1,n,memo)+grid_traveller(m,n-1,memo)
  return memo[key]
print(grid_traveller(6,6,memo))
print(grid_traveller(60,76,memo))
print(grid_traveller(800,250,memo))
print(grid_traveller(100,1000,memo))