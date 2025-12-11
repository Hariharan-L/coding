a=input()
stack =[]
large=0
dicts = {')':'(',']':'[','}':'{'}
maxi=0
lst=""
st=""
# prev=0
for i in a:
    if(i in "{(["):
        stack.append(i)
        st+=i
    else:
        temp=dicts[i]
        l=len(stack)
        if(l!=0):
            s=stack[l-1]
            if(s==temp):
                stack.pop()
                st+=i
                maxi+=2
            else:
                stack.append(i)
                maxi=0
                large=max(large,maxi)
                st=""
                lst=lst if len(lst)>len(st) else st
        else:
            stack.append(i)
            lst=lst if len(lst)>len(st) else st
            st=""
            large=max(large,maxi)
            maxi=0
    large=max(large,maxi)
    lst=lst if len(lst)>len(st) else st

            
print(large)
print(lst)