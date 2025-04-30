package com.paymentsys.model;

public class LoginRequest {
    private String username;
    private String password;

    public String getUsername(){//getter methods dont have any parameters
        return username;
    }
    public String getPassword(){
        return password;
    }
    //we need to write setters if we are receving json @RequestBody in Springboot
    public void setUsername(String username)
    {
        this.username = username;//this is used to intialize the 
    }
    public void setPassword(String password){
        this.password = password;
    }
    
}
