package com.nubes.cms.dao;

import java.util.List;

import com.nubes.cms.domain.Contact;

public interface ContactDAO {
	Contact addContact(Contact contact);

	List<Contact> getContacts();

	Contact updateContact(Contact contact);

	Contact getContactById(Integer cid);

	boolean deleteContact(Integer cid);

	List<Contact> search(String str);
}
