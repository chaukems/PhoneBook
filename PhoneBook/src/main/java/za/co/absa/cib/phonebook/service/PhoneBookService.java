/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.absa.cib.phonebook.service;

import java.util.List;
import za.co.absa.cib.phonebook.entity.Entry;
import za.co.absa.cib.phonebook.entity.PhoneBook;
import za.co.absa.cib.phonebook.util.SearchCriteria;

/**
 *
 * @author schauke
 */
public interface PhoneBookService {

    PhoneBook save(PhoneBook phoneBook);

    PhoneBook findById(long id);

    PhoneBook findByName(String name);

    List<Entry> findEntries(SearchCriteria searchCriteria);
    
     List<PhoneBook> findAll();

}
