def find(str,char):
    count = 0
    for c in str:
        if char == c:
           count += 1
        return count
