
def check_authenticity(credit_card_number):
    lenght = len(str(credit_card_number)) #check lenght of credit_card_number, input for len() need to be string, thats why int->string 
    return (lenght == 15 or lenght == 16 or lenght == 13) and check_sum(credit_card_number)


def check_sum(card_number):      #algorytm luhn'a 
    sum = 0
    i = 0
    while card_number != 0:
        if i % 2 == 0:
            sum += card_number % 10
        else:
            digit = 2 * (card_number % 10)
            sum += digit // 10 + digit % 10
        i += 1
        card_number //= 10
    return (sum % 10) == 0

def print_credit_card_bank(card_number):
    if ((card_number >= 34e13 and card_number <35e13) or (card_number >= 37e13 and card_number < 38e13)):
        print("AMEX")
    elif (card_number >= 51e14 and card_number < 56e14):
        print("MASTERCARD")
    elif ((card_number >= 4e12 and card_number < 5e12) or (card_number >= 4e15 and card_number < 5e15)):
        print("VISA")
    else:
        print("INVALID")

print("Ten program sprawdza do jakiej firmy nalezy numer karty kredytowej. \n Dostepne opcje to VISA, MASTERCARD oraz AMEX \n Link do generatora numerow kart \n https://ccardgenerator.com/ ")




number_of_cards = int(input("Ile kart chcesz sprawdzic? \n"))



i = 0

while i < number_of_cards:
    credit_card_number = (input("wprowadz numer karty kredytowej z generatora: "))

    if(credit_card_number.isdigit()):
        credit_card_number = int(credit_card_number)
        check_authenticity(credit_card_number)
        print_credit_card_bank(credit_card_number)
        i += 1

        print("Jest to twoja", i, "karta z", number_of_cards)
    else:
        print("Prosze wpisac wylacznie cyfry!")
        

print("Dziekuje, program zakonczyl prace")

print("just for commit test")