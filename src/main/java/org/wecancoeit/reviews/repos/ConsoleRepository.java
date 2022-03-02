package org.wecancoeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.entities.Console;
import org.wecancoeit.reviews.entities.Manufacturer;

import java.util.Collection;
import java.util.Optional;

public interface ConsoleRepository extends CrudRepository<Console,Long> {
    Optional<Console> findByNameIgnoreCase(String name);
    Optional<Collection<Console>> findByManufacturerIgnoreCase(String name);
}
