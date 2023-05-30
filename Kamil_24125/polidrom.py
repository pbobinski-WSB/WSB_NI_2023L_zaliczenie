def czy_polidrom(n): # liczba jest palindromem, jeśli możemy odczytać ją od lewej do prawej i od prawej do lewej, otrzymując tę samą liczbę.
    binarny_n = bin(n)[2:] # Konwersja na binarny i usunięcie prefiksu '0b'
    return binarny_n == binarny_n[::-1] # Sprawdzamy, czy ten ciąg binarny jest palindromem, porównując go z jego odwróconą wersją, używając składni [::-1]. Zwracamy True, jeśli ciąg binarny jest palindromem, a w przeciwnym razie zwracamy False.

liczba = int(input("Podaj liczbę: "))

if czy_polidrom(liczba):
    print("Liczba jest palindromem")
else:
    print("Liczba nie jest palindromem")