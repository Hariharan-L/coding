# l=input()
# t=len(l)
# l=l[::-1]
# num=0
# for i in range(t):
#   num=num+(2**i)*int(l[i])
# print(num)
def bin_dec(l):
  le=len(l)-1
  if l=="1":
    return 1
  elif l=="0":
    return 0
  else:
    return (2**le)*int(l[0]) + bin_dec(l[1:])
f=input()
print(bin_dec(f))