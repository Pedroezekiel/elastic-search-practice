package elasticsearch.controller;

import elasticsearch.models.Book;
import elasticsearch.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class BookController {

    private final BookRepository repository;


    @PostMapping
    public Book create(@RequestBody Book book) {
        return repository.save(book);
    }

    @GetMapping("/{id}")
    public Optional<Book> findById(@PathVariable String id) {
        return repository.findById(id);
    }


    @PutMapping("/{id}")
    public Book update(@PathVariable String id, @RequestBody Book book) {
        return repository.save(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }
}

