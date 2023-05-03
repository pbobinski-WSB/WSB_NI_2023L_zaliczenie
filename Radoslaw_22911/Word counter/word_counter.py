import os

os.system('cls')

filename = "Romeo_and_Juliet.txt"

try:
    with open(filename, encoding='utf-8') as f:
        contents = f.read()
except FileNotFoundError:
    print(f"Plik {filename} nie istnieje!")
else:
    # Obliczanie przybliżonej ilości słów w pliku.

    words = contents.split()
    num_words = len(words)
    print(words)
    print(f"Plik {filename} zawiera {num_words} słów.")