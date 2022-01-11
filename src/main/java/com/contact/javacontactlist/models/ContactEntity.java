package com.contact.javacontactlist.models;

import javax.persistence.*;

/**
 * Entity Contact
 *
 * @author ialeman
 */
@Entity
@Table(name = "contacts")
public class ContactEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "contactid")
    private Integer contactId;

    @Column(name = "contactage")
    private Integer contactAge;

    @Column(name = "contactname")
    private String contactName;

    @Column(name = "contactnickname")
    private String contactNickname;

    @Column(name = "contactphone")
    private String contactPhone;

    @Column(name = "createddate")
    private Long createdDate;

    /* getters and setters */
    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getContactAge() {
        return contactAge;
    }

    public void setContactAge(Integer contactAge) {
        this.contactAge = contactAge;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNickname() {
        return contactNickname;
    }

    public void setContactNickname(String contactNickname) {
        this.contactNickname = contactNickname;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "ContactEntity{" +
                "contactId=" + contactId +
                ", contactAge=" + contactAge +
                ", contactName='" + contactName + '\'' +
                ", contactNickname='" + contactNickname + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
