package com.example.demo;

import java.util.List;

import com.example.demo.Core.Passenger;
import com.example.demo.application.IPassengerService;
import com.example.demo.application.PassengerService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassengerController {
    IPassengerService service = new PassengerService();

    @PostMapping("/passenger/add")
    public Boolean add(@RequestBody Passenger p) {
        return service.add(p);
    }
    
    @GetMapping("/passenger")
    public List<Passenger> getAllPassengers() {
        return service.getAllPassengers();
    }

    @DeleteMapping("/passenger/{id}/delete")
    public boolean delete(@PathVariable int id) {
        return service.delete(id);
    }

    @PostMapping("/passenger/login")
    public Boolean login(@RequestBody Passenger p) {
        return service.login(p.getUserName(),p.getPassword());
    }
}
