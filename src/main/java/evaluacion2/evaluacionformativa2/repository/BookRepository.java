package evaluacion2.evaluacionformativa2.repository;

import evaluacion2.evaluacionformativa2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}