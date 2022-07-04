package com.example.demo.Core;


import java.util.List;

import com.example.demo.Persistence.DatabaseSavingMethods;


//import static classes.DatabaseSavingMethods.PassengersList;


public class Passenger_Manager extends Managers {


	public boolean Register(Passenger p) {	
		p.setId(Local.getNextIdPass());
		return Local.AddPassengers(p);
	}

	public List<Passenger> getAllPass(){
		return Local.getAllPassengers();
	}

	public boolean removePass(int id){
		return Local.RemovePassengers(id);
	}
	





	@Override
	public void SetDBSmethod(DatabaseSavingMethods DBS) {
		this.DBS1 = DBS;
		
	}

    public Boolean passlogin(String un, String pass) {
        return Local.PassengerLogin(un,pass);
    }
}
