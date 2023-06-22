def dodaj(a, b):
    return a + b

def odejmij(a, b):
    return a - b

def pomnóż(a, b):
    return a * b

def podziel(a, b):
    if b != 0:
        return a / b
    else:
        return "Błąd: próba dzielenia przez zero"

x = 5
y = 2

wynik_dodawania = dodaj(x, y)
print("Wynik dodawania:", wynik_dodawania)

wynik_odejmowania = odejmij(x, y)
print("Wynik odejmowania:", wynik_odejmowania)

wynik_mnożenia = pomnóż(x, y)
print("Wynik mnożenia:", wynik_mnożenia)

wynik_dzielenia = podziel(x, y)
print("Wynik dzielenia:", wynik_dzielenia)
