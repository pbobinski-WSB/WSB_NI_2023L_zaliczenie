a = 0
b = 1
for i in range(20):
    if i > 1:
        a, b = b, a
        a += b
    print(a if a > b else b)