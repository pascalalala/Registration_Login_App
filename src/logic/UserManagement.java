package logic;

import dao.User;

import dao.User;
import database.inMemoryDatabase;

public class UserManagement {

    private inMemoryDatabase database;

    public UserManagement() {
        this.database = new inMemoryDatabase();
    }

    public boolean saveUser(User user) {
        return this.database.addUser(user);
    }

    public User authenticateUser(String email, String password) {
        User user = this.database.getUser(email);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
