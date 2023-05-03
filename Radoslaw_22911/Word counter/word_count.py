import os

os.system('cls')

def count_words(filename):
    "Obliczanie przybliżonej liczby słów w danym pliku."
    try:
        with open(filename, encoding="utf-8") as f:
            contents = f.read()
    except FileNotFoundError:
        #pass
        print(f"Przepraszamy, ale plik {filename} nie istnieje.")
    else:
        words = contents.split()
        num_words = len(words)
        print(f"Plik {filename} zawiera {num_words} słów.")

filenames = ['Romeo_and_Juliet.txt', 'Siddhartha.txt', 'Moby_Dick.txt', 'Little_Women.txt']
for filename in filenames:
    count_words(filename)