# 1)
# s=list(input().split(" "))
# l=len(s)
# for i in range(l-1,-1,-1):
#   print(s[i],end=" ")
# # 2)
# # 3)
# # s=input()
# # l=[]
# # for i in s:
# #   if i not in l:
# #     l.append(i)
# # l=dict.fromkeys(l)
# # for i in l:
# #   print(i+str(s.count(i)),end="")
# s=input()
# l=0
# le=len(s)
# for i in range(le):
#   if s[i]=="-":
#     l+=1
#     s=s.replace(s[i],"")
#     le=len(s)
# while(l!=0):
#   s="-"+s
#   l-=1
# print(s)


# s=input()
# start=0
# def rev(s,start,end):
#   s=list(s)
#   while(start<end):
#     s[start],s[end]=s[end],s[start]
#     start+=1
#     end-=1
#   s=''.join(s)
#   return s
# for i in range(len(s)):
#   if s[i]==" ":
#     end=i-1
#     s=rev(s,start,end)
#     start=i+1
#   if i==len(s)-1:
#     end=i
#     s=rev(s,start,end)
#     start=i+1
# print(s)