def oblicz_srednia(lista_liczb):
    return sum(lista_liczb) / len(lista_liczb)

ilosc_liczb = int(input("Podaj ile liczb wprowadzasz? "))
liczby = []

for i in range(ilosc_liczb):
    liczba = float(input(f"Podaj liczbę {i+1}: "))
    liczby.append(liczba)

srednia = oblicz_srednia(liczby)
print(f"Średnia arytmetyczna wprowadzonych liczb wynosi: {srednia}")
