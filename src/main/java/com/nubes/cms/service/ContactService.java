package com.nubes.cms.service;

import java.util.List;

import com.nubes.cms.dto.ContactDTO;

public interface ContactService {

		ContactDTO addContact(ContactDTO contactDTO);
		List<ContactDTO> getContacts();
		ContactDTO updateContact(ContactDTO contactDTO);
		ContactDTO getContactById(Integer cid);
		boolean deleteContact(Integer cid);
		List<ContactDTO> search(String str);
		
}
