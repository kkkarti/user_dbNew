package jm.task.core.jdbc.service;

import jm.task.core.jdbc.model.User;

import java.util.List;

public interface UserService {
    void createTable();
    void dropTable();
    void truncateTable();
    void addUser(User user);
    void deleteUser(long id);

    void createUsersTable();

    void dropUsersTable();

    void saveUser(String name, String lastName, byte age);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanTable();

    void cleanUsersTable();
}