def oblicz_bmi(waga, wzrost):
    bmi = waga / (wzrost ** 2)
    return bmi

def interpretuj_bmi(bmi):
    if bmi < 18.5:
        return "Masz niedowagę."
    elif bmi >= 18.5 and bmi < 25:
        return "Twoja waga jest prawidłowa."
    else:
        return "Masz nadwagę."

try:
    waga = float(input("Podaj swoją wagę (w kg): "))
    wzrost = float(input("Podaj swój wzrost (w metrach): "))

    wynik_bmi = oblicz_bmi(waga, wzrost)
    print("Twoje BMI wynosi:", wynik_bmi)
    interpretacja = interpretuj_bmi(wynik_bmi)
    print(interpretacja)

except ValueError:
    print("Wprowadzono nieprawidłowe dane. Podaj wartości liczbowe.")
