package com.example.demo.Persistence;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Core.Driver;
import com.example.demo.Core.Passenger;
import com.example.demo.Core.Ride;

public class LocalSaving implements DatabaseSavingMethods {
	



static public ArrayList<Driver> PendingDriversList = new ArrayList<Driver>();
static public ArrayList<Driver> VerfiedDriversList = new ArrayList<Driver>();
private static ArrayList<Passenger> PassengersList = new ArrayList<Passenger>();
static public ArrayList<Ride> RidesList = new ArrayList<Ride>();
	
	@Override
	public boolean AddPendingDrivers(Driver d) {
		return PendingDriversList.add(d);
	}
	
	@Override
	public boolean AddPassengers(Passenger p) {
		return PassengersList.add(p) ;
	}

	@Override
	public List<Passenger> getAllPassengers(){
		return PassengersList;
	}
	
	@Override
	public boolean AddVerfiedDrivers(Driver d) {
		return VerfiedDriversList.add(d);
	}


	@Override
	public boolean AddRides(Ride r) {
		return RidesList.add(r);
		
	}

    public int getNextIdRide() {
        return RidesList.size();
    }

	public int getNextIdPass() {
        return PassengersList.size();
    }

	public int getNextIdDriv() {
        return PendingDriversList.size();
    }

	public boolean RemovePassengers(int id) {
		Passenger p = new Passenger();
		p = PassengersList.get(id);
		return PassengersList.remove(p) ;
	}

	public boolean RemoveDriver(int id) {
		Driver p = new Driver();
		p = VerfiedDriversList.get(id);
		return VerfiedDriversList.remove(p) ;
	}

	public boolean RemoveRide(int id) {
		Ride p = new Ride();
		p = RidesList.get(id);
		return RidesList.remove(p) ;
	}

	public Boolean PassengerLogin(String un, String pass) {
		for (Passenger p : PassengersList) {
			if (p.getUserName().equals(un) && p.getPassword().equals(pass)) {
				 return true;
			}
		 }	
	 return false;
	}

	public List<Driver> getAllDrivers() {
		return PendingDriversList;
	}

	public Boolean DriverLogin(String un, String pass) {
		for (Driver d : VerfiedDriversList) {
			if (d.getUserName().equals(un) && d.getPassword().equals(pass)) {
				 return true;
			}
		 }	
	 return false;
	}
	public Driver getUnverfiedDriv(int id){
		return PendingDriversList.get(id);
	}

	public boolean RemoveDriverUn(int id) {
		Driver d = new Driver();
		d = PendingDriversList.get(id);
		return PendingDriversList.remove(d);
	}

	public List<Driver> getAllDriversv() {
		return VerfiedDriversList;
	}

    public boolean addFavArea(String fav, int id) {
		Driver d = new Driver();
		d = VerfiedDriversList.get(id);
        return d.AddFavArea(fav);
    }

	public List<Ride> RideinFav(int id) {
		ArrayList<Ride> Ridesinfav = new ArrayList<Ride>();
		Driver d = new Driver();
		d = VerfiedDriversList.get(id);
		for (Ride r : RidesList){
			for (int i = 0 ; i < VerfiedDriversList.size(); i++){
				if (d.FavoriteAreasList.get(i).equals(r.getSource())){
					Ridesinfav.add(r);
				}
			}
		}
		return RideinFav(id);
	}

	public List<Ride> getAllRides() {
		return RidesList;
	}
}
