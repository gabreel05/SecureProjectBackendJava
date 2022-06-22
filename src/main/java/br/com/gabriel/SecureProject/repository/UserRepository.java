package br.com.gabriel.SecureProject.repository;

import br.com.gabriel.SecureProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmailAndPassword(String email, String password);
}
