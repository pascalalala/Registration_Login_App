package database;

import dao.User;

import java.util.ArrayList;

public class inMemoryDatabase {

    private ArrayList<User> userDatabase;

    public inMemoryDatabase() {
        this.userDatabase = new ArrayList<>();
    }


    public boolean addUser(User user){
        if(user != null){
            return  this.userDatabase.add(user);
        }
        return false;
    }

    public boolean removeUser(int userId) {
        for (User user : this.userDatabase) {
            if (user.getId() == userId) {
                return this.userDatabase.remove(user);
            }
        }
        return false;
    }

    public User getUser(int userId) {
        for (User user : this.userDatabase) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    public User getUser(String email) {
        if (email != null) {
            for (User user : this.userDatabase) {
                if (user.getEmail().equals(email)) {
                    return user;
                }
            }
        }
        return null;
    }

    public ArrayList<User> getAllUser() {
        return this.userDatabase;
    }
}
