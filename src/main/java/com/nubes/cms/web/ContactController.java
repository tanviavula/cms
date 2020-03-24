package com.nubes.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nubes.cms.dto.ContactDTO;
import com.nubes.cms.service.ContactService;

@RestController
@RequestMapping("/api/contact/")
public class ContactController {

	@Autowired
	private ContactService contactService;

	@PostMapping("addnew")
	public ContactDTO addContact(@RequestBody ContactDTO contactDTO) {
		contactDTO = contactService.addContact(contactDTO);
		return contactDTO;
	}

}
