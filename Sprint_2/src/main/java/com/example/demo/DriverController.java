package com.example.demo;

import java.util.List;

import com.example.demo.Core.Driver;
import com.example.demo.Core.Ride;
import com.example.demo.application.AdminService;
import com.example.demo.application.DriverService;
import com.example.demo.application.IAdminService;
import com.example.demo.application.IDriverService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {
    IDriverService service = new DriverService();
    IAdminService service1 = new AdminService();

    @PostMapping("/driver/{id}/verify")
    public boolean verify(@PathVariable int id) {
        return service1.verify(id);
    }

    @PostMapping("/driver/add")
    public Boolean add(@RequestBody Driver d) {
        return service.add(d);
    }
    
    @GetMapping("/driver/pending")
    public List<Driver> getAllDrivers() {
        return service.getAllDrivers();
    }
    @GetMapping("/driver/verfied")
    public List<Driver> getAllDriversv() {
        return service.getAllDriversv();
    }

    @DeleteMapping("/driver/{id}/delete/verfied")
    public boolean delete(@PathVariable int id) {
        return service.delete(id);
    }
    @DeleteMapping("/driver/{id}/delete/pending")
    public boolean deletep(@PathVariable int id) {
        return service.deletep(id);
    }

    @PostMapping("/driver/login")
    public Boolean login(@RequestBody Driver d) {
        return service.login(d.getUserName(),d.getPassword());
    }

    @PostMapping("/driver/{id}/addfav")
    public boolean addfav(@PathVariable int id,@RequestBody String fav) {
        return service.AddfavArea(fav,id);
    }

    @GetMapping("/driver/{id}/allrides")
    public List<Ride> AllRidesinfav(@PathVariable int id) {
        return service.AllRideinFav(id);
    }
}
