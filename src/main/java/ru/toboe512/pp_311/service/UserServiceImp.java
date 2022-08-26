package ru.toboe512.pp_311.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.toboe512.pp_311.dao.UserDAO;
import ru.toboe512.pp_311.models.User;


import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Transactional
    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Transactional
    @Override
    public List<User> listUsers() {
        return userDAO.listUsers();
    }

    @Transactional
    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Transactional
    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Transactional
    @Override
    public User getUser(Long id) {
        return userDAO.getUser(id);
    }
}
