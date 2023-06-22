package com.example.usermanagement;

import java.util.ArrayList;
import java.util.List;

/**
 * Zarządza użytkownikami systemu.
 */
public class UserManager {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void updateUserEmail(String username, String newEmail) {
        User user = findUserByUsername(username);
        if (user != null) {
            user.setEmail(newEmail);
        }
    }

    // Inne metody zarządzania użytkownikami
}
