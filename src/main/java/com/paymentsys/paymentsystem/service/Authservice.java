package com.paymentsys.paymentsystem.service;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.paymentsys.paymentsystem.model.LoginRequest;
import com.paymentsys.paymentsystem.model.SigninRequest;
import com.paymentsys.paymentsystem.model.User;
import com.paymentsys.paymentsystem.repository.UserRepository;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

//import com.paymentsys.model.User;
//import com.paymentsys.repository.*;
@Service
public class Authservice {
    @Value("${jwt.secret}")
    private final  String SECRET_KEY ;
    Authservice (String SECRET_KEY){
        this.SECRET_KEY=SECRET_KEY;
    }
    @Autowired //dependency injection
    private UserRepository userRepository;
    public User registerUser(User newuser){
        return userRepository.save(newuser);}
//to validate if user is alreay present
  /*  public User authenticate_User(String email ,String password){
        Optional<User> user = userRepository.findByemail(email);//to avoid null values
        //if email is found can register as a user and if not found return user not found 
        if(user.isPresent()&&user.get().getPassword().equals(password)){//user.ispresent a method of Optional conatiner obejct
            return user.get();


        }else{
            throw new RuntimeException("invalid credentials");
        }
    }*/
    public String login(LoginRequest request) {//this login method is a different one then from authcontroller due to different types
        // You'd normally check username/password against DB here
        if ("admin".equals(request.getUsername()) && "password".equals(request.getPassword())) {

            return Jwts.builder()
                    .setSubject(request.getUsername())
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // 1 day
                    .signWith(SignatureAlgorithm.HS256, SECRET_KEY)                    
                    .compact();

        } else {
            throw new RuntimeException("Invalid username or password");
        }
    }

            //Cannot make a static reference to the non-static method getUsername() from the type LoginRequest



    public String signup(SigninRequest sig){
        Optional<User> existingbyEmal = userRepository.findByemail(sig.getEmail());
        Optional<User> existingbyUsernam = userRepository.findByusername(sig.getUsername());  

        if(existingbyEmal.isPresent()|| existingbyUsernam.isPresent())//isPresent is a method of the Optional class of utill library
        {
            return "User has already registered";
        }
        User user = new User();
        user.setEmail(sig.getEmail());
        user.setUsername(sig.getUsername());
        user.setPassword(sig.getPassword()); 

        userRepository.save(user);
        return "user registered";
    }
        }



        
    

    
    

    

