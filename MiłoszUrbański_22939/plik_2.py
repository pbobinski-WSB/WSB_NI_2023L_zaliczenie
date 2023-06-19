celsius = float(input("Podaj temperaturę w stopniach Celsiusza: "))

fahrenheit = (celsius * 9/5) + 32
print("Temperatura w stopniach Fahrenheit wynosi:", fahrenheit)

# Dodatkowa funkcjonalność: Sprawdzenie, czy jest to temperatura powyżej lub poniżej punktu zamarzania wody
if fahrenheit <= 32:
    print("To jest temperatura poniżej punktu zamarzania wody.")
elif fahrenheit >= 212:
    print("To jest temperatura powyżej punktu wrzenia wody.")
else:
    print("To jest temperatura w normalnym zakresie.")
