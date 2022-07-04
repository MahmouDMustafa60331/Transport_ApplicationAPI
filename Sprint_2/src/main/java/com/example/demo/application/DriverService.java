package com.example.demo.application;

import java.util.List;

import com.example.demo.Core.Driver;
import com.example.demo.Core.Driver_Manager;
import com.example.demo.Core.Ride;

public class DriverService implements IDriverService {
    public static Driver_Manager dManager = new Driver_Manager();

    @Override
    public boolean add(Driver d) {
        return dManager.Register(d);
    }

    @Override
    public List<Driver> getAllDrivers() {
        return dManager.getAllDriv();
    }

    @Override
    public boolean delete(int id) {
        return dManager.removeDriv(id);
    }

    @Override
    public Boolean login(String un, String pass) {
        return dManager.drivlogin(un,pass);
    }

    @Override
    public List<Driver> getAllDriversv() {
        return dManager.getALLDrivv();
    }

    @Override
    public boolean deletep(int id) {
        return dManager.removeDrivv(id);
    }

    @Override
    public boolean AddfavArea(String fav , int id) {
        return dManager.AddFav(fav , id);
    }

    @Override
    public List<Ride> AllRideinFav(int id) {
        return dManager.AllridesinFav(id);
    }

    
}
