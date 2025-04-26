package com.paymentsys.service;
import com.paymentsys.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import com.paymentsys.repository.UserRepository;
import com.paymentsys.model.User;
import com.paymentsys.repository.*;
@Service
public class Userservice {
    @Autowired //dependency injection
    private UserRepository userRepository;
    public User registerUser(User newuser){
        return userRepository.save(newuser);}
//to validate if user is alreay present
    public User authenticate_User(String email ,String password){
        Optional<User> user = userRepository.findByemail(email);//to avoid null values
        //if email is found can register as a user and if not found return user not found 
        if(user.isPresent()&&user.get().getpassword().equals(password)){//user.ispresent a method of Optional conatiner obejct
            return user.get();


        }else{
            throw new RuntimeException("invalid credentials");


        }
    }
    

    
}
