import pandas as pd

data = {
    'Rok': [2002],
    'Zwycięzca': ['Brazylia'],
    'Król strzelców': ['Ronaldo']
    'Stadion': ['Stadion Międzynarodowy w Jokohamie']
    'Wynik': ['2:0'],
    'Finalista': ['Niemcy']
}

df = pd.DataFrame(data)
print(df)
