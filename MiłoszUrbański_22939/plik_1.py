try:
    waga = float(input("Podaj swoją wagę (w kg): "))
    wzrost = float(input("Podaj swój wzrost (w metrach): "))

    bmi = waga / (wzrost ** 2)
    print("Twoje BMI wynosi:", bmi)

    if bmi < 18.5:
        print("Masz niedowagę.")
    elif bmi >= 18.5 and bmi < 25:
        print("Twoja waga jest prawidłowa.")
    else:
        print("Masz nadwagę.")

except ValueError:
    print("Wprowadzono nieprawidłowe dane. Podaj wartości liczbowe.")
