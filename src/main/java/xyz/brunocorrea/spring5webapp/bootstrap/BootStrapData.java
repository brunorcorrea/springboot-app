package xyz.brunocorrea.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import xyz.brunocorrea.spring5webapp.domain.Author;
import xyz.brunocorrea.spring5webapp.domain.Book;
import xyz.brunocorrea.spring5webapp.domain.Publisher;
import xyz.brunocorrea.spring5webapp.repositories.AuthorRepository;
import xyz.brunocorrea.spring5webapp.repositories.BookRepository;
import xyz.brunocorrea.spring5webapp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher("Oracle", "St. Rows Street", "New York City", "New York", "13212-123");
        publisherRepository.save(publisher);

        Author author1 = new Author("Eric", "Evans");
        Book book1 = new Book("Domain Driven Design", "123123");

        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);
        book1.setPublisher(publisher);
        publisher.getBooks().add(book1);

        authorRepository.save(author1);
        bookRepository.save(book1);
        publisherRepository.save(publisher);

        Author author2 = new Author("Rod", "Johnson");
        Book book2 = new Book("J2EE Development without EJB", "324312");

        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);
        book2.setPublisher(publisher);
        publisher.getBooks().add(book2);


        authorRepository.save(author2);
        bookRepository.save(book2);
        publisherRepository.save(publisher);


        System.out.println("Started in Bootstrap");

        System.out.println("Number of Boks: " + bookRepository.count());
        System.out.println("Number of Publishers: " + publisherRepository.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
    }
}
