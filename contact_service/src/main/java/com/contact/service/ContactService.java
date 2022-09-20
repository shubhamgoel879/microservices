package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactService {

    List<Contact> list=List.of(
        new Contact(10L,"s@gmail.com","c1",1000L),
        new Contact(11L,"p@gmail.com","c2",1000L),
        new Contact(12L,"g@gmail.com","c3",1001L)
    );

    public List<Contact> getContactsOfUser(Long userId) {
        return this.list.stream().filter(x->x.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
