# input: hrs min
hrs=int(input())
mi=int(input())
minangle=abs((hrs*30+(mi*0.5))-mi*6)
minangle=min(minangle,360-minangle)
print(minangle)