def dodawanie(a, b):
    return a + b

def odejmowanie(a, b):
    return a - b

def mnozenie(a, b):
    return a * b

def dzielenie(a, b):
    if b != 0:
        return a / b
    else:
        return "Nie można dzielić przez zero!"

print("Kalkulator")
print("Wybierz operację:")
print("1. Dodawanie")
print("2. Odejmowanie")
print("3. Mnożenie")
print("4. Dzielenie")

wybor = input("Wybierz opcję (1/2/3/4): ")

liczba1 = float(input("Podaj pierwszą liczbę: "))
liczba2 = float(input("Podaj drugą liczbę: "))

if wybor == '1':
    wynik = dodawanie(liczba1, liczba2)
elif wybor == '2':
    wynik = odejmowanie(liczba1, liczba2)
elif wybor == '3':
    wynik = mnozenie(liczba1, liczba2)
elif wybor == '4':
    wynik = dzielenie(liczba1, liczba2)
else:
    wynik = "Nieprawidłowy wybór operacji!"

# Dodatkowa zmiana: Zaokrąglenie wyniku do 2 miejsc po przecinku
wynik = round(wynik, 2)

print("Wynik: ", wynik)
