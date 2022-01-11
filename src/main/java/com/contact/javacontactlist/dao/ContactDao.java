package com.contact.javacontactlist.dao;

import com.contact.javacontactlist.models.ContactEntity;
import java.util.List;

public interface ContactDao {

    /**
     * Retrieve a Contact with contact ID given
     *
     * @param contactId Integer
     * @return Contact found
     */
    ContactEntity getContactById(Integer contactId);

    /**
     * Retrieve all contacts register
     *
     * @return A list of contacts
     */
    List<ContactEntity> getContactList();

    /**
     * Create a Contact with an entity
     *
     * @param entity ContactEntity
     */
    void createContact(ContactEntity entity);

    /**
     * Update a Contact with an entity
     * @param entity ContactEntity
     */
    void editContact(ContactEntity entity);

    /**
     * Delete a Contact with a contact ID
     *
     * @param contactId Integer
     */
    void deleteContact(Integer contactId);

}
