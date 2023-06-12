def is_palindrome(word):

    word = word.lower()
    reversed_word = word[::-1]
    return word == reversed_word

def main():

    user_input = input("Podaj słowo: ")

    if is_palindrome(user_input):

        print("Podane słowo jest palindromem.")

    else:
        print("Podane słowo nie jest palindromem.")
main()