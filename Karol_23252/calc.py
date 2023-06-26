def dodaj(a, b):
    return a + b

def odejmij(a, b):
    return a - b

def pomnoz(a, b):
    return a * b

def podziel(a, b):
    if b == 0:
        return "ERROR! Nie można dzielić przez zero."
    else:
        return a / b

while True:
    print("\nProsty Kalkulator")
    print("1. Dodaj")
    print("2. Odejmij")
    print("3. Pomnoż")
    print("4. Podziel")
    print("5. Wyjdź")

    wybor = input("Wybierz opcję (1-5): ")

    if wybor == '5':
        print("Koniec programu.")
        break

    liczba1 = float(input("Podaj pierwszą liczbę: "))
    liczba2 = float(input("Podaj drugą liczbę: "))

    if wybor == '1':
        print("Wynik: ", dodaj(liczba1, liczba2))
    elif wybor == '2':
        print("Wynik: ", odejmij(liczba1, liczba2))
    elif wybor == '3':
        print("Wynik: ", pomnoz(liczba1, liczba2))
    elif wybor == '4':
        print("Wynik: ", podziel(liczba1, liczba2))
    else:
        print("Nieznana opcja, spróbuj ponownie.")
