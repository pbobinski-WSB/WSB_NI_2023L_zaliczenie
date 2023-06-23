a = 2
b = 1
for i in range(25):
    if i > 1:
        a, b = b, a
        a += b
    print(a if a > b else b)