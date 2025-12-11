def factorial(x):
  if x>1:
    return x*factorial(x-1)
  else:
    return 1
a=int(input("Enter the factorial number: "))
print(factorial(a))