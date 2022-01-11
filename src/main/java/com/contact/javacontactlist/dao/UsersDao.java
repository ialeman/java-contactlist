package com.contact.javacontactlist.dao;

import com.contact.javacontactlist.models.ContactEntity;
import com.contact.javacontactlist.models.UserEntity;

import java.util.List;

public interface UsersDao {

    /**
     * Retrieve a User with the Username
     *
     * @param username String
     * @return Contact found
     */
    UserEntity getUserByUsername(String username);

    /**
     * Retrieve a User with an ID
     *
     * @param entityId Integer
     * @return Contact found
     */
    UserEntity getUserById(Integer entityId);

    /**
     * Retrieve all users in DB
     *
     * @return A list of users
     */
    List<UserEntity> getUsersList();


    /**
     * Create a User with an entity
     *
     * @param entity ContactEntity
     */
    void createUser(UserEntity entity);
}
