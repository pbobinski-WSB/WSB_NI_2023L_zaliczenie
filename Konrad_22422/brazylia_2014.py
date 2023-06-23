import pandas as pd

data = {
    'Rok': [2014],
    'Zwycięzca': ['Niemcy'],
    'Król strzelców': ['James Rodríguez'],
    'Stadion': ['Estádio do Maracanã w Rio de Janeiro'],
    'Wynik': ['1:0'],
    'Finalista': ['Holandia']
}

df = pd.DataFrame(data)
print(df)