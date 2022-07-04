package com.example.demo.application;


import java.util.List;

import com.example.demo.Core.Passenger;
import com.example.demo.Core.Passenger_Manager;

public class PassengerService implements IPassengerService {

    public Passenger_Manager pManager = new Passenger_Manager();
    public boolean add(Passenger p){
       return pManager.Register(p);
    }

    @Override
    public List<Passenger> getAllPassengers() {
        return pManager.getAllPass();
    }

    @Override
    public boolean delete(int id) {
        return pManager.removePass(id);
    }

    @Override
    public Boolean login(String un, String pass) {
        return pManager.passlogin(un,pass);
    }
}
