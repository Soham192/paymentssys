
package com.paymentsys.paymentsystem.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentsys.paymentsystem.model.JwtResponse;
import com.paymentsys.paymentsystem.model.LoginRequest;
import com.paymentsys.paymentsystem.model.SigninRequest;
import com.paymentsys.paymentsystem.service.Authservice;

@RestController
@RequestMapping("/")
public class Authcontroller {
    private final Authservice authService ;//final is used
    public Authcontroller (Authservice authService){
        this.authService = authService;
    }
     

    @PostMapping("/signup")
    public String signup (@RequestBody SigninRequest signinRequest){
        //now how do I store this into jpa repo,thats the work of service
        return authService.signup(signinRequest);   
    }

    @PostMapping("/login")
    public ResponseEntity<?> login (@RequestBody LoginRequest loginRequest){//this login method is a different one then from authservice due to different types
        String token = authService.login(loginRequest);//token?
        return ResponseEntity.ok(new JwtResponse(token));
    }//@RequestBody This annotation tells Spring to automatically convert the incoming JSON payload in the HTTP request into a Java object.




    
}
