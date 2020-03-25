package com.nubes.cms.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.nubes.cms.dao.ContactDAO;
import com.nubes.cms.domain.Contact;
import com.nubes.cms.dto.ContactDTO;

@Service
public class ContactServiceImpl implements ContactService {

	private static final Logger log = LoggerFactory.getLogger(ContactServiceImpl.class);
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private ContactDAO contactDAO;

	@Override
	public ContactDTO addContact(ContactDTO contactDTO) {
		Assert.notNull(contactDTO, "Contact object can't be null");
		Contact contact = modelMapper.map(contactDTO, Contact.class);
		contact = contactDAO.addContact(contact);
		log.info("Contact is added with id:{}", contact.getCid());
		contactDTO = modelMapper.map(contact, ContactDTO.class);
		return contactDTO;
	}

	@Override
	public List<ContactDTO> getContacts() {
		List<Contact> contacts = contactDAO.getContacts();
		log.info("Total Contacts found in DB:{}", contacts.size());
		List<ContactDTO> contactsList = contacts.stream().map(e -> modelMapper.map(e, ContactDTO.class))
				.collect(Collectors.toList());
		return contactsList;
	}

	@Override
	public ContactDTO updateContact(ContactDTO contactDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContactDTO getContactById(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ContactDTO> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

}
