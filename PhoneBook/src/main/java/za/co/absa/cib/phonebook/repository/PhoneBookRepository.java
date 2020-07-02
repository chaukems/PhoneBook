/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.absa.cib.phonebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.absa.cib.phonebook.entity.PhoneBook;

/**
 *
 * @author schauke
 */
public interface PhoneBookRepository extends JpaRepository<PhoneBook, Long> {

    PhoneBook findByName(String name);
}
