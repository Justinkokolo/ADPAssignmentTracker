package org.assignmentTracker.repository.impl;

import org.assignmentTracker.entity.User;
import org.assignmentTracker.repository.generic.UserRepository;

import java.util.HashSet;
import java.util.Set;

public class UserRepositoryImpl implements UserRepository {

    private static UserRepository repo = null;
    private Set<User> userDB;

    private UserRepositoryImpl(){
        this.userDB = new HashSet<>();
    }

    public static UserRepository getRepo(){
        if(repo == null) repo = new UserRepositoryImpl();
        return repo;
    }

    @Override
    public Set<User> getAll() {
        return userDB;
    }

    @Override
    public User create(User user) {
        this.userDB.add(user);
        return user;
    }

    @Override
    public User read(Integer integer) {
        //User user = this.userDB.stream().filter(r -> r.getID().trim().equalsIgnoreCase(id)).findAny().orElse(null);
        //return user;
        for (User user : this.userDB){
            if(user.getID() == integer) return user;
        }
        return null;
    }

    @Override
    public User update(User user) {
        boolean deleteUser = delete(user.getID());
        if(deleteUser){
            this.userDB.add(user);
            return user;
        }
        return null;
    }

    @Override
    public boolean delete(Integer integer) {
        User user = read(integer);
        if(user != null){
            this.userDB.remove(user);
            return true;
        }
        return false;
    }
}