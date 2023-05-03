import os

os.system('cls')

absolute_path = os.path.dirname(__file__)
relative_path = "Romeo_and_Juliet.txt"

filename = os.path.join(absolute_path, relative_path)

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
    print(f"\n\tPlik {filename} zawiera {num_words} słów.")