import pandas as pd

data = {
    'Rok': [2006],
    'Zwycięzca': ['Włochy']
    'Król strzelców': ['Miroslav Klose'],
    'Stadion': ['Olympiastadion w Berlinie']
}

df = pd.DataFrame(data)
print(df)