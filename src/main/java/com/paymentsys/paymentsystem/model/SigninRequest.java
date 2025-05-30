package com.paymentsys.paymentsystem.model;

public class SigninRequest {
    
    private String username;//write this go where final was written to understand it
    private String password;
    private String email;

   /* private SigninRequestString username,String password){
        this.password=password;
        this.username=username;
     
    })0)
    
}*/

public SigninRequest(){

}
//no argument constuctor ,its okay even we dont declare it as java automatically adds it
public void setUsername(String username){
    this.username=username;

}
public void setEmail(String email){
    this.email=email;
}
public void setPassword(String password){
    this.password=password;
}
public String getUsername(){
    return username;

}
public String getPassword(){
    return password;
}

public String getEmail(){
    return email;
}

}