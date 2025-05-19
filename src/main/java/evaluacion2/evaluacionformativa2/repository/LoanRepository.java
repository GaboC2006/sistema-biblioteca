package evaluacion2.evaluacionformativa2.repository;

import evaluacion2.evaluacionformativa2.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}