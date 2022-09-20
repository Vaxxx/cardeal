package ng.com.createsoftware.cardeal.repository;


import ng.com.createsoftware.cardeal.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

    Optional<Owner> findByFirstname(String firstname);
}
