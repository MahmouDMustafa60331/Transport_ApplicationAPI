package com.example.demo.application;

import java.util.List;

import com.example.demo.Core.Ride;
import com.example.demo.Core.Ride_Manager;

public class RideService implements IRideService  {
    Ride_Manager rManager = new Ride_Manager();

    @Override
    public boolean add(Ride r) {
        return rManager.AddRide(r);
    }

    @Override
    public List<Ride> getAllRides() {
        return rManager.AllRide();
    }

    @Override
    public boolean EndRide(int id) {
        return rManager.EndRide(id);
    }
    
}

