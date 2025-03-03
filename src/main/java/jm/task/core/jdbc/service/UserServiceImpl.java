package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao US = new UserDaoJDBCImpl();

    public void createUsersTable() {
        US.createUsersTable();
    }

    public void dropUsersTable() {
        US.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        US.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        US.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return US.getAllUsers();
    }

    public void cleanUsersTable() {
        US.cleanUsersTable();
    }
}