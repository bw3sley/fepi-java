package br.fepi.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.fepi.demo.model.Contact;

import br.fepi.demo.repository.ContactRepository;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    private ContactRepository repository;

    @GetMapping
    public List<Contact> get() {
        return repository.findAll();
    }

    @PostMapping
    public String add(@RequestBody Contact contact) {
        repository.save(contact);
        
        return "201";
    }

    @PutMapping
    public String update(@RequestBody Contact contact) {
        if (contact.getId() > 0) {
            repository.save(contact);
            
            return "204";
        }

        return "404";
    }

    @DeleteMapping
    public String delete(@RequestBody Contact contact) {
        if (contact.getId() > 0) {
            repository.delete(contact);
        
            return "204";
        }

        return "404";
    }
}
