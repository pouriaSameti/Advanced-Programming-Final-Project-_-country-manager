package com.company.bankery;
import java.io.Serializable;

public class LoginAccount implements Serializable {

    private String username ;
    private String password ;

    public LoginAccount(String username, String password)
    {
        this.username = username ;
        this.password = password ;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
}
