package com.contact.javacontactlist.controller;

import com.contact.javacontactlist.dao.ContactDao;
import com.contact.javacontactlist.dao.ContactDaoImp;
import com.contact.javacontactlist.models.ContactEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContactController {

    @Autowired
    private ContactDao contactDao;

    @RequestMapping(value = "api/contact/{contactId}")
    public ContactEntity getContactById(@PathVariable Integer contactId) {
        return contactDao.getContactById(contactId);
    }

    @RequestMapping(value = "api/contact/getAll")
    public List<ContactEntity> getAllContact() {
        return contactDao.getContactList();
    }

    @RequestMapping(value = "api/contact/create", method = RequestMethod.POST)
    public void createContact(@RequestBody ContactEntity entity) {
        Calendar cal = Calendar.getInstance();
        entity.setCreatedDate(cal.getTimeInMillis() / 1000);
        contactDao.createContact(entity);
    }

    @RequestMapping(value = "api/contact/update", method = RequestMethod.PUT)
    public void updateContact(@RequestBody ContactEntity entity) {
        contactDao.editContact(entity);
    }

    @RequestMapping(value = "api/contact/delete/{contactId}", method = RequestMethod.DELETE)
    public void deleteContact(@PathVariable Integer contactId) {
        contactDao.deleteContact(contactId);
    }

}
