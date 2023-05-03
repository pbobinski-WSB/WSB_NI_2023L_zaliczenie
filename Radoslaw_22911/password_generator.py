import random
import os

os.system('cls')

chars = 'abcdefghijklmopqrstuvxyzABCDEFGHIJKLMOPQRSTUVXYZ!@#$%^&*()1234567890'

number = input("Ammount of passwords to generate: ")
number = int(number)

lenght = input("Password lenght: ")
lenght = int(lenght)

print("Passwords generated:\n")

for pwd in range(number):
    password = ''
    for i in range(lenght):
        password += random.choice(chars)
    print(password)