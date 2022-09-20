package ng.com.createsoftware.cardeal;

import ng.com.createsoftware.cardeal.model.Owner;
import ng.com.createsoftware.cardeal.repository.OwnerRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class OwnerRepositoryTest {

    @Autowired
    private OwnerRepository repository;

    @Test
    @DisplayName("Save a new Owner")
    void saveOwner(){
        repository.save(new Owner("Hulk", "Hogan"));
        assertThat(repository.findByFirstname("Hulk").isPresent()).isTrue();
    }

    @Test
    void deleteOwners(){
        repository.save(new Owner("Mira", "Tarun"));
        repository.deleteAll();
        assertThat(repository.count()).isEqualTo(0);
    }
}
