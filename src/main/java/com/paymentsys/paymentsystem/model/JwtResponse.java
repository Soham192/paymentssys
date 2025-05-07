package com.paymentsys.paymentsystem.model;

public class JwtResponse {
    public String token;

    public JwtResponse(String token){
        this.token = token;

    }
    public String getToken(){//as getter methods have no parameter
        return token;

    }
    public void setToken(String token){//setter methods dont return anything as their purpose is to set values and not return them
        this.token=token;//by convention in java setters retrun void 
    }

    
}
