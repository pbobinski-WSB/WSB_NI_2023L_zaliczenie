from random import randint
import os
import time

os.system('cls')

print("Program do trenowania mnożenia. Wpisz 'q', aby zakończyć.")

first = [value_first for value_first in range(0,10)]
second = [value_second for value_second in range(0,10)]

active = True
while active:
    a = first[randint(0,9)]

    b = second[randint(0,9)]
    
    answer = input(f"{a} x {b} = ")
    if answer == 'q':
        active = False
    else:
        answer = int(answer)
        try:
            if answer == a * b:
                print("Correct!")
                time.sleep(0.5)
                os.system('cls')
            else:
                print("Incorrect!")
                time.sleep(0.5)
                os.system('cls')
        except ValueError:
            print("Unexpected input value!")
            time.sleep(0.5)
            os.system('cls')