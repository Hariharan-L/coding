memo={}
def nth_fibanocce(n,memo):
  if n in memo:
    return memo[n]
  if n<=2:
    return 1
  memo[n]=nth_fibanocce(n-1,memo)+nth_fibanocce(n-2,memo)
  return memo[n]
print(nth_fibanocce(6,memo))
print(nth_fibanocce(7,memo))
print(nth_fibanocce(1000,memo))