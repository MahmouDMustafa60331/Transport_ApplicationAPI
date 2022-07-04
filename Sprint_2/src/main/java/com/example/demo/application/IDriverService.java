package com.example.demo.application;

import java.util.List;

import com.example.demo.Core.Driver;
import com.example.demo.Core.Ride;

public interface IDriverService {
    boolean add(Driver d);

    List<Driver> getAllDrivers();

    boolean delete(int id);

    Boolean login(String un, String pass);

    List<Driver> getAllDriversv();

    boolean deletep(int id);

    boolean AddfavArea(String fav, int id);

    List<Ride> AllRideinFav(int id);

}
