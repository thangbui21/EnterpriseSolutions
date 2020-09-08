package enterprise.solutions.repository;

import java.util.Optional;
import enterprise.solutions.models.ERole;
import enterprise.solutions.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
