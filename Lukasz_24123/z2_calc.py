def calculate_square(num):
    return num * num

def calculate_cube(num):
    return num*num*num
result = int(input("Podaj liczbe calkowita: \n"))
print("Kwadrat liczby: ",result, "wynosi: ", calculate_square(result)," a sześcian: ",calculate_cube(result))