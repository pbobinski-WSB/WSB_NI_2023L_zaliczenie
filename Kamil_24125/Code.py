def check_authenticity(credit_card_number):
    lenght = len(str(credit_card_number)) #check lenght of credit_card_number, input for len() need to be string, thats why int->string 
    return (lenght == 15 or lenght == 16 or lenght == 13) and check_sum(credit_card_number)