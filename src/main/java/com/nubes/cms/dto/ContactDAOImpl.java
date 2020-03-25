package com.nubes.cms.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nubes.cms.dao.ContactDAO;
import com.nubes.cms.domain.Contact;
import com.nubes.cms.repo.ContactRepo;

@Repository
public class ContactDAOImpl implements ContactDAO {
	@Autowired
	private ContactRepo contactRepo;
	
	@Override
	public Contact addContact(Contact contact) {
		return contactRepo.save(contact);
	}

	@Override
	public List<Contact> getContacts() {
		return contactRepo.findAll();
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactById(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Contact> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

}
