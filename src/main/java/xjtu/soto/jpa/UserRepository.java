package xjtu.soto.jpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByName(String name);


    List<User> findByEmailAndName(String email, String name);
}

