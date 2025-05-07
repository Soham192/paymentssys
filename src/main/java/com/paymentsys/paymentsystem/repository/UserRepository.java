//enroll into beta testing programs at night and explore areas in fintech that require problem solving
package com.paymentsys.paymentsystem.repository;
//import com.paymentsys.model.SigninRequest;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paymentsys.paymentsystem.model.User;

@Repository

public interface UserRepository extends JpaRepository<User,Long> {//inheritance
    Optional<User> findByemail(String email);//optional is part of javautil library and?
    Optional<User> findByusername(String username);
//findByemail


    
    
}