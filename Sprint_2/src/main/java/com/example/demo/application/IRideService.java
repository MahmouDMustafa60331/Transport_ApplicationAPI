package com.example.demo.application;

import java.util.List;

import com.example.demo.Core.Ride;

public interface IRideService {
    
    boolean add(Ride d);

    List<Ride> getAllRides();

    boolean EndRide(int id);
    
}
