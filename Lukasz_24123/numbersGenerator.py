import random

numbers = [random.randint(1, 1000) for i in range(9)]

print("Wygenerowane liczby to:")
print(numbers)

sum_of_numbers = sum(numbers)

print("Suma liczb to:")
print(sum_of_numbers)