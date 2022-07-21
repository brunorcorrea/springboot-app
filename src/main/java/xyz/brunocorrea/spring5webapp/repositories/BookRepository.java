package xyz.brunocorrea.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import xyz.brunocorrea.spring5webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
