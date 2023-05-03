# Gra polegająca na odgadnięciu liczby wylosowanej przez komputer
# Komputer podaje wskazówki, odnośnie wylosowanej przez niego liczby

from random import randint
import os

os.system('cls')

W_GRZE = True

print('Podaj zakres, z jakiego mam losować liczby.\n')

a = int(input('Od '))
b = int(input('Do '))
print(f'Zakres to liczby od {a} do {b}.\n')

los = randint(a,b+1)
print(los)

print('Mam na myśli pewną liczbę... Zgadnij jaką!\n')

while W_GRZE:
    odpowiedz = int(input("\tPodaj swoją liczbę: "))
    
    if odpowiedz in range(a,b+1):
        if odpowiedz == los:
            os.system('cls')
            print('\t\t(*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^)\n\t\t\t=== Brawo! ===\n\t\t*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^\n\n')

            decyzja = input('Chcesz zagrać jeszcze raz? (T/N) ')
            if decyzja in ['T', 't']:
                try:
                    continue
                except TypeError:
                    print('Błędne dane!')
                    continue
            else:
                print('Do widzenia!')
                W_GRZE = False

        else:
            if odpowiedz < los:
                os.system('cls')
                print('Moja liczba jest większa\n')
            elif odpowiedz > los:
                os.system('cls')
                print('Moja liczba jest mniejsza\n')
            continue

    else:
        os.system('cls')
        print('Podana przez Ciebie liczba jest poza zakresem! Spróbuj ponownie.\n')
        continue