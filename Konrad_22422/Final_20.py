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

sklad_psg = [
    ["Numer", "Zawodnik", "Pozycja"],
    ["1", "Keylor Navas", "Bramkarz"],
    ["4", "Thilo Kehrer", "Obrońca"],
    ["3", "Presnel Kimpembe", "Obrońca"],
    ["5", "Marquinhos", "Obrońca"],
    ["14", "Juan Bernat", "Obrońca"],
    ["8", "Leandro Paredes", "Pomocnik"],
    ["6", "Marco Verratti", "Pomocnik"],
    ["11", "Ángel Di María", "Pomocnik"],
    ["7", "Kylian Mbappé", "Napastnik"],
    ["10", "Neymar", "Napastnik"],
    ["9", "Mauro Icardi", "Napastnik"]

# Wypisanie składu Bayernu Monachium
for pozycja in sklad_bayernu:
    print("{:<5} {:<20} {:<10}".format(pozycja[0], pozycja[1], pozycja[2]))

print("\n")

# Wypisanie składu PSG
print("Skład PSG:")
for pozycja in sklad_psg:
    print("{:<5} {:<20} {:<10}".format(pozycja[0], pozycja[1], pozycja[2]))