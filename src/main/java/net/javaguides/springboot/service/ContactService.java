package net.javaguides.springboot.service;

import java.util.List;
import org.springframework.data.domain.Page;
import net.javaguides.springboot.model.Contact;

public interface ContactService {
    List<Contact> getAllContacts();
    void saveContact(Contact contact);
    Contact getContactById(long id);
    void deleteContactById(long id);
    Page<Contact> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
    List<Contact> searchContacts(String keyword);
}

