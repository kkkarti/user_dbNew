package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Alice", "Johnson", (byte) 25);
        userService.saveUser("Bob", "Smith", (byte) 30);
        userService.saveUser("Charlie", "Brown", (byte) 28);
        userService.saveUser("Pasha", "Techinc", (byte) 35);

        List<User> users = userService.getAllUsers();
        System.out.println("Список пользователей:");
        users.forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}