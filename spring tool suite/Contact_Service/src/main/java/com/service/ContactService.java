package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.Contact;

@Service
public interface ContactService {
public List<Contact> getContactsOfUser(Long userId);

}
