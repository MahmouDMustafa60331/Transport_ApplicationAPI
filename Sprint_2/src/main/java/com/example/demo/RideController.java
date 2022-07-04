package com.example.demo;

import java.util.List;

import com.example.demo.Core.Ride;
import com.example.demo.application.IRideService;
import com.example.demo.application.RideService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RideController {
    IRideService service = new RideService();

    @PostMapping("/ride/requestRide")
    public Boolean add(@RequestBody Ride r) {
        return service.add(r);
    }

    @DeleteMapping("/ride/{id}/delete")
    public boolean delete(@PathVariable int id) {
        return service.EndRide(id);
    }
    
    @GetMapping("/ride")
    public List<Ride> getAlRides() {
        return service.getAllRides();
    }
}
