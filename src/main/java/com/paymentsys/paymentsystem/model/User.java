package com.paymentsys.paymentsystem.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import com.paymentsys.service.*;;
@Entity
@Table(name = "`user`")  // Using backticks to escape the reserved keyword
public class User {
    public User(){

    }//no argument constructor
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;

    private String username;
    private String email;
    private String password;

    // Getters and setters
    public String getPassword()//every method must have a parameter although gettermethods shouldnt have any paramteres
    {
        return password;

    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setEmail(String email){
        this.email=email;

    }
    public void setUsername(String username){
        this.username=username;

    }
}


