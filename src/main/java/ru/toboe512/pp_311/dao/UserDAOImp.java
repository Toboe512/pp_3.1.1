package ru.toboe512.pp_311.dao;

import org.springframework.stereotype.Repository;
import ru.toboe512.pp_311.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> listUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void delete(User user) {
        entityManager.remove(entityManager.merge(user));
    }

    @Override
    public void update(User user) {
        entityManager.persist(entityManager.merge(user));
    }

    @Override
    public User getUser(Long id) {
        return entityManager.createQuery("from User user where user.id=:id", User.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
