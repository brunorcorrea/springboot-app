package xyz.brunocorrea.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import xyz.brunocorrea.spring5webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
