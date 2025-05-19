package evaluacion2.evaluacionformativa2.repository;

import evaluacion2.evaluacionformativa2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}