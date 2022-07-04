package com.example.demo.Core;

// import java.util.Scanner;

public class Passenger extends User {
	public int id = 0;
	public Passenger(String username, String password,String Email, String mobilenumber) {
		this.username = username;
		this.email = Email;
		this.password = password;
		this.mobilenumber= mobilenumber;
	}
	public Passenger() {
    }
    public void setId(int id){
        this.id= id;
    }
    public String getUserName() {
        return username;
    }
    public String getPassword() {
        return password;
    }

}
