package com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
List<Contact> list= List.of(
		new Contact(1L,"aditya@gmail.com","Aditya",1311L),
		new Contact(2L,"anil@gmail.com","Ani",1311L),
		new Contact(3L,"rohan@gmail.com","Rohan",1312L),
		new Contact(4L,"mohan@gmail.com","Mohan",1313L)
		);
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact ->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}
	 //return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
}
