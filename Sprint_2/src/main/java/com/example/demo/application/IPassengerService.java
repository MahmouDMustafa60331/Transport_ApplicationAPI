package com.example.demo.application;

import java.util.List;

import com.example.demo.Core.Passenger;

public interface IPassengerService {
    boolean add(Passenger p);

    List<Passenger> getAllPassengers();

    boolean delete(int id);

    Boolean login(String un, String pass);

}
