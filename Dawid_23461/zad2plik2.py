def determinant(matrix):
#    wyliczanie wyznacznika macierzy
    if len(matrix) == 1:
        print('ret')
        return matrix[0][0]
    result = 0
    sign = 1
    for i in range(len(matrix[0])):
        print(matrix[1:])
        print(result)
        result += sign * matrix[0][i] * determinant([j[:i] + j[i+1:] for j in matrix[1:]])
    return result

determinant([ [2, 3], [4,5]])