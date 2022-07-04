package com.example.demo.Core;


import java.util.List;

import com.example.demo.Persistence.DatabaseSavingMethods;

public class Ride_Manager extends Managers {

	// public void Notify(Ride r) {
	// 	for (String element : FavoriteAreasList) {
	// 		if (element.contains(r.Source)) {
	// 			System.out.println("There is a Ride in one of your favourite areas!");
	// 		}

	// 	}
	// }
	public boolean AddRide(Ride r)
	{
		r.RequestRide(r.getSource(), r.getDestination());
		return Local.AddRides(r);
	}
	
	@Override
	public void SetDBSmethod(DatabaseSavingMethods DBS) {
		this.DBS1 = DBS;
		
	}

	public boolean EndRide(int id) {
		return Local.RemoveRide(id);
	}

	public List<Ride> AllRide() {
		return Local.getAllRides();
	}

}
