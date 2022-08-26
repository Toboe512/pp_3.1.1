package ru.toboe512.pp_311.service;


import ru.toboe512.pp_311.models.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    void delete(User user);

    void update(User user);

    User getUser(Long id);
}
