package com.example.usermanagement.test;

import com.example.usermanagement.User;
import com.example.usermanagement.UserManager;

/**
 * Klasa testowa do sprawdzania funkcjonalności klas z pakietu "com.example.usermanagement".
 */
public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        // Dodawanie użytkowników
        User user1 = new User("john", "password123", "john@example.com");
        User user2 = new User("alice", "password456", "alice@example.com");
        userManager.addUser(user1);
        userManager.addUser(user2);

        // Wyszukiwanie użytkownika po nazwie użytkownika
        User foundUser = userManager.findUserByUsername("john");
        if (foundUser != null) {
            System.out.println("Znaleziono użytkownika: " + foundUser.getUsername());
        } else {
            System.out.println("Nie znaleziono użytkownika o podanej nazwie");
        }

        // Aktualizacja adresu e-mail użytkownika
        userManager.updateUserEmail("john", "john.doe@example.com");

        // Usuwanie użytkownika
        userManager.removeUser(user2);
    }
}
