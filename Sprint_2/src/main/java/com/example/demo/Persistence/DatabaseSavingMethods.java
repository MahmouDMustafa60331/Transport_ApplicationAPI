package com.example.demo.Persistence;

import java.util.List;

import com.example.demo.Core.Driver;
import com.example.demo.Core.Passenger;
import com.example.demo.Core.Ride;

public interface DatabaseSavingMethods {

	
	public boolean AddPendingDrivers(Driver Driver);

	public boolean AddPassengers(Passenger Passenger);

	public List<Passenger> getAllPassengers();

	public boolean AddVerfiedDrivers(Driver Driver);
	
	public boolean AddRides(Ride Ride);
}
