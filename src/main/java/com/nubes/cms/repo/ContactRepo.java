package com.nubes.cms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nubes.cms.domain.Contact;

public interface ContactRepo extends JpaRepository<Contact,Integer> {

}
