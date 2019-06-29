package app.crm.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.crm.model.Contact;
import app.crm.repository.ContactRepository;

@Component
public class ContactsLoader implements CommandLineRunner {

    private final ContactRepository repository;

    @Autowired
    public ContactsLoader(ContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Contact("Ankur", "Goel", "me@me.com"));
        this.repository.save(new Contact("Kanika", "Jauhari", "me1@me.com"));
    }
}
