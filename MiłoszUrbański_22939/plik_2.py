def celsius_to_fahrenheit(celsius):
    fahrenheit = (celsius * 9/5) + 32
    return fahrenheit

def fahrenheit_to_celsius(fahrenheit):
    celsius = (fahrenheit - 32) * 5/9
    return celsius

try:
    temperatura = float(input("Podaj temperaturę: "))
    jednostka = input("Wybierz jednostkę (C - stopnie Celsiusza, F - stopnie Fahrenheita): ")

    if jednostka.upper() == "C":
        fahrenheit = celsius_to_fahrenheit(temperatura)
        print("Temperatura w stopniach Fahrenheit wynosi:", fahrenheit)
    elif jednostka.upper() == "F":
        celsius = fahrenheit_to_celsius(temperatura)
        print("Temperatura w stopniach Celsiusza wynosi:", celsius)
    else:
        print("Nieprawidłowy wybór jednostki.")

except ValueError:
    print("Wprowadzono nieprawidłową temperaturę. Podaj wartość liczbową.")
