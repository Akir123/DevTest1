package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class Contact {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cID;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "user_id")
    private Long userId;

    public Contact() {
        super();
    }

    public Contact(Long cID, String email, String contactName, Long userId) {
        this.cID = cID;
        this.email = email;
        this.contactName = contactName;
        this.userId = userId;
    }

    public Long getcID() {
        return cID;
    }

    public void setcID(Long cID) {
        this.cID = cID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
