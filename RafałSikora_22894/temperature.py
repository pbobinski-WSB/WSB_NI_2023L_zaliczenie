while True:
    try:
        celsjusz = float(input("Podaj temperaturę w stopniach Celsjusza: "))
        break
    except ValueError:
        print("Błąd! Wprowadź poprawną liczbę.")

fahrenheity = (celsjusz * 9/5) + 32

print("Temperatura w stopniach Fahrenheita wynosi:", fahrenheity)
