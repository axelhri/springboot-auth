package spring_auth.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_auth.user.model.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(String email);
}
