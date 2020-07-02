/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.absa.cib.phonebook.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.absa.cib.phonebook.entity.Entry;
import za.co.absa.cib.phonebook.entity.PhoneBook;
import za.co.absa.cib.phonebook.repository.PhoneBookRepository;
import za.co.absa.cib.phonebook.util.SearchCriteria;

/**
 *
 * @author schauke
 */
@Service
public class PhoneBookServiceImpl implements PhoneBookService {

    @Autowired
    private PhoneBookRepository phoneBookRepository;

    @Override
    public PhoneBook save(PhoneBook phoneBook) {
        PhoneBook book = phoneBookRepository.save(phoneBook);
        
        return book;
    }

    @Override
    public PhoneBook findById(long id) {
        return phoneBookRepository.findById(id).get();
    }

    @Override
    public PhoneBook findByName(String name) {
        return phoneBookRepository.findByName(name);
    }

    @Override
    public List<Entry> findEntries(SearchCriteria searchCriteria) {
        return null;
    }

    @Override
    public List<PhoneBook> findAll() {
        return phoneBookRepository.findAll();
    }

}
