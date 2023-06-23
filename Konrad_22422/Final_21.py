sklad_chelsea = [
    ["Numer", "Zawodnik", "Pozycja"],
    ["16", "Edouard Mendy", "Bramkarz"],
    ["28", "Cesar Azpilicueta", "Obrońca"],
    ["2", "Antonio Rüdiger", "Obrońca"],
    ["6", "Thiago Silva", "Obrońca"],
    ["21", "Ben Chilwell", "Obrońca"],
    ["7", "N'Golo Kanté", "Pomocnik"],
    ["5", "Jorginho", "Pomocnik"],
    ["19", "Mason Mount", "Pomocnik"],
    ["22", "Christian Pulisic", "Pomocnik"],
    ["11", "Timo Werner", "Napastnik"],
    ["10", "Kai Havertz", "Napastnik"]
]

# Wypisanie składu Chelsea
print("Skład Chelsea:")
for pozycja in sklad_chelsea:
    print("{:<5} {:<20} {:<10}".format(pozycja[0], pozycja[1], pozycja[2]))
	
print()