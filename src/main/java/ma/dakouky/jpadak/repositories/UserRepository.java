package ma.dakouky.jpadak.repositories;

import ma.dakouky.jpadak.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

User findByUsername(String userName);
}
