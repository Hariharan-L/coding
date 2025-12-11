def mawords(k, words, n, m):
    words = [word for word in words if len(word) <= m]

    def bt(index, lines):
        if index == len(words):
            return sum(len(line.split()) for line in lines)

        maword = 0
        word = words[index]

        for i in range(len(lines)):
            if len(lines[i]) + len(word) + (1 if lines[i] else 0) <= m:
                oline = lines[i]
                lines[i] += (' ' if lines[i] else '') + word
                maword = max(maword, bt(index + 1, lines))
                lines[i] = oline  
        if len(lines) < n:
            lines.append(word)
            maword = max(maword, bt(index + 1, lines))
            lines.pop() 

        return maword
    return bt(0, [])
k = int(input())
words = [input().strip() for _ in range(k)]
n, m = map(int, input().split())
print(mawords(k, words, n, m))