package xyz.brunocorrea.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import xyz.brunocorrea.spring5webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
