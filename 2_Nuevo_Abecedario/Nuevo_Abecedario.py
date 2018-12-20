vocales = ("A", "E", "I", "O", "U", "a", "e", "i", "o", "u")

n = int(input())
palabra = list(input())

for x in range(0, n):
    if palabra[x] == "D":
        palabra[x] = "W"
        if x > 0:
            if palabra[x-1] in vocales:
                palabra[x] = "X"

    if palabra[x] == "d":
        palabra[x] = "w"
        if x > 0:
            if palabra[x-1] in vocales:
                palabra[x] = "x"

print("".join(palabra))
