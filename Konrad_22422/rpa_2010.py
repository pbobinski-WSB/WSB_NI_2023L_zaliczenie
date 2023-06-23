import pandas as pd

data = {
    'Rok': [2010],
    'Zwycięzca': ['Hiszpania'],
    'Król strzelców': ['David Villa'],
    'Stadion': ['Soccer City Stadium w Johannesburgu']
    'Wynik': ['1:0'],
    'Finalista': ['Holandia']
}

df = pd.DataFrame(data)
print(df)