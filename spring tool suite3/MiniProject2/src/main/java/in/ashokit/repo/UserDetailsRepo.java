package in.ashokit.repo;

import org.springframework.data.repository.CrudRepository;
import in.ashokit.entity.UserDetailsEntity;

public interface UserDetailsRepo extends CrudRepository<UserDetailsEntity, Integer> {
    // Define any additional methods if needed
	public UserDetailsEntity findByEmail(String email);
	public UserDetailsEntity findByEmailAndPwd(String email, String pwd);
}

