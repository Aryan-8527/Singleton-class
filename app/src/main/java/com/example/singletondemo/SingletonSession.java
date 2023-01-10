package com.example.singletondemo;

public class SingletonSession {

    //static  reference of its class

    private static SingletonSession instance;
    private String username;
    private String lastname;


    //make constructor private //
    private SingletonSession() {}

    // One static method
    public static SingletonSession Instance()
    {
        //if no instance is initialized yet then create new instance
        //else return stored instance
        if (instance == null)
        {
            instance = new SingletonSession();
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
