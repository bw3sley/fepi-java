package br.fepi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fepi.demo.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    
}
