package com.contact.javacontactlist.dao;

import com.contact.javacontactlist.models.ContactEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ContactDaoImp implements ContactDao {

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public ContactEntity getContactById(Integer contactId) {
        return entityManager.find(ContactEntity.class, contactId);
    }

    @Override
    public List<ContactEntity> getContactList() {
        String query = "FROM ContactEntity";
        return  entityManager.createQuery(query).getResultList();
    }

    @Override
    public void createContact(ContactEntity entity) {
        entityManager.merge(entity);
    }

    @Override
    public void editContact(ContactEntity entity) {
        entityManager.merge(entity);
    }

    @Override
    public void deleteContact(Integer contactId) {
        ContactEntity entity = entityManager.find(ContactEntity.class, contactId);
        entityManager.remove(entity);
    }


}
