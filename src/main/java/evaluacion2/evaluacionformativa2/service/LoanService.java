package evaluacion2.evaluacionformativa2.service;

import evaluacion2.evaluacionformativa2.model.Book;
import evaluacion2.evaluacionformativa2.model.Loan;
import evaluacion2.evaluacionformativa2.repository.BookRepository;
import evaluacion2.evaluacionformativa2.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class LoanService {
    
    @Autowired
    private LoanRepository loanRepository;
    
    @Autowired
    private BookRepository bookRepository;
    
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }
    
    public Optional<Loan> getLoanById(Long id) {
        return loanRepository.findById(id);
    }
    
    public Loan saveLoan(Loan loan) {
        // Fijar la fecha del préstamo si se trata de un préstamo nuevo
        if (loan.getId() == null) {
            loan.setLoanDate(LocalDate.now());
            loan.setReturnDate(LocalDate.now().plusDays(14)); // 2 weeks loan period
            
            // Actualizar disponibilidad de libros
            Book book = loan.getBook();
            if (book != null) {
                book.setAvailable(false);
                bookRepository.save(book);
            }
        }
        return loanRepository.save(loan);
    }
    
    public void deleteLoan(Long id) {
        Optional<Loan> loan = loanRepository.findById(id);
        if (loan.isPresent()) {
            // Actualizar la disponibilidad de libros cuando se elimina un préstamo
            Book book = loan.get().getBook();
            if (book != null) {
                book.setAvailable(true);
                bookRepository.save(book);
            }
            loanRepository.deleteById(id);
        }
    }
}