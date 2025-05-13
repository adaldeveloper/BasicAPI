package com.devspring.dev.dao;

import com.devspring.dev.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<User> getAllUsers() {

        String hqlAllUsers = "FROM Benutzer";
        return entityManager.createQuery(hqlAllUsers, User.class).getResultList();

    }
}
