sklad_bayernu = [
    ["Numer", "Zawodnik", "Pozycja"],
    ["1", "Manuel Neuer", "Bramkarz"],
    ["5", "Benjamin Pavard", "Obrońca"],
    ["17", "Jérôme Boateng", "Obrońca"],
    ["21", "Lucas Hernández", "Obrońca"],
    ["27", "David Alaba", "Obrońca"],
    ["18", "Leon Goretzka", "Pomocnik"],
    ["6", "Joshua Kimmich", "Pomocnik"],
    ["25", "Thomas Müller", "Pomocnik"],
    ["10", "Leroy Sané", "Pomocnik"],
    ["7", "Serge Gnabry", "Napastnik"],
    ["9", "Robert Lewandowski", "Napastnik"]
]

# Wypisanie składu Bayernu Monachium
for pozycja in sklad_bayernu:
    print("{:<5} {:<20} {:<10}".format(pozycja[0], pozycja[1], pozycja[2]))

print("\n")