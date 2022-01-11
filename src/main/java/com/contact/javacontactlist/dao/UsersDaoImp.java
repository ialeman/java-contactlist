package com.contact.javacontactlist.dao;

import com.contact.javacontactlist.models.UserEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UsersDaoImp implements UsersDao {

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public UserEntity getUserByUsername(String username) {
        String query = "FROM UserEntity WHERE username = '"+username+"'";
        return (UserEntity) entityManager.createQuery(query).getSingleResult();
    }

    @Override
    public UserEntity getUserById(Integer entityId) {
        return entityManager.find(UserEntity.class, entityId);
    }

    @Override
    public List<UserEntity> getUsersList() {
        String query = "FROM UserEntity";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void createUser(UserEntity entity) {
        entityManager.merge(entity);
    }
}
