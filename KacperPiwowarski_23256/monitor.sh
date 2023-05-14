#!/bin/bash

if [ -z "$1" ]; then
    echo "Podaj adres IP lub URL:"
    read address
else
    address="$1"
fi

if [[ $address =~ ^[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$ ]]; then
    if ping -c 1 "$address" >/dev/null; then
        echo "Host o adresie $address jest dostępny"
    else
        echo "Host o adresie $address jest niedostępny"
    fi
else
    status_code=$(curl -s -o /dev/null -w "%{http_code}" -I "$address" -L)

    if [[ $status_code -eq 200 ]]; then
        echo "Strona HTML istnieje"
    elif [[ $status_code -eq 404 ]]; then
        echo "Strona HTML nie istnieje"
    else
        echo "Nieznany kod odpowiedzi HTTP: $status_code"
    fi
fi
