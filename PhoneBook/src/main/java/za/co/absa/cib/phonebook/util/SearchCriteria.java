/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.absa.cib.phonebook.util;

import lombok.Getter;
import lombok.Setter;
import za.co.absa.cib.phonebook.entity.PhoneBook;

/**
 *
 * @author schauke
 */
@Getter
@Setter
public class SearchCriteria {

    String name;
    long id;
    PhoneBook phoneBook;

}
