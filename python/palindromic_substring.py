s=input()
res=""
reslen=0
if(len(s)%2!=0):
  for i in range(len(s)):
    #odd
    r,l=i,i
    while (r<len(s) and l>=0 and s[l]==s[r]):
      if(r-l+1 >reslen):
        res=s[l:r+1]
        reslen=r-l+1
      l-=1
      r+=1
else:
  for i in range(len(s)):
    l,r=i,i+1
    while (r<len(s) and l>=0 and s[l]==s[r]):
      if(r-l+1 >reslen):
        res=s[l:r+1]
        reslen=r-l+1
      l-=1
      r+=1
print("++++"+res)