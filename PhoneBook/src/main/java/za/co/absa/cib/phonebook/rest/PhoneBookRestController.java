/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.absa.cib.phonebook.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.absa.cib.phonebook.entity.Entry;
import za.co.absa.cib.phonebook.entity.PhoneBook;
import za.co.absa.cib.phonebook.service.PhoneBookService;
import za.co.absa.cib.phonebook.util.SearchCriteria;

/**
 *
 * @author schauke
 */
@CrossOrigin
@RestController
@RequestMapping("/api/phonebook")
public class PhoneBookRestController {

    @Autowired
    private PhoneBookService phoneBookService;

    @PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PhoneBook savePhoneBook(@RequestBody PhoneBook phoneBook) {
        return phoneBookService.save(phoneBook);
    }

    @GetMapping("/findbyid/{id}")
    public PhoneBook findById(@PathVariable long id) {
        return  phoneBookService.findById(id);
    }

    @GetMapping("/findbyname/{name}")
    public PhoneBook findByName(@PathVariable String name) {
        return phoneBookService.findByName(name);
    }

    @GetMapping("/find/entries")
    public List<Entry> findEntries(@RequestBody SearchCriteria searchCriteria) {
        return phoneBookService.findEntries(searchCriteria);
    }
    
      @GetMapping("/findAll")
    public List<PhoneBook> findAll() {
        return phoneBookService.findAll();
    }

}
