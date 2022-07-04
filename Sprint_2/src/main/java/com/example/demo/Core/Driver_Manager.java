package com.example.demo.Core;

import java.util.ArrayList;
import java.util.List;

//import static classes.DatabaseSavingMethods.VerfiedDriversList;

import com.example.demo.Persistence.DatabaseSavingMethods;
import com.example.demo.Persistence.LocalSaving;


public class Driver_Manager extends Managers {
	

	public boolean Register(Driver d) {
		d.setId(Local.getNextIdDriv());
		return Local.AddPendingDrivers(d);

	}

	public void login() {
		// Scanner in = new Scanner(System.in);
		// System.out.print("Enter The Username: ");
		// String usern = in.nextLine();
		// for (Driver element : LocalSaving.VerfiedDriversList) {
		// 	if (element.username.contains(usern)) {
		// 		System.out.print("Enter The Password: ");
		// 		String password = in.nextLine();
		// 		if (password.equals(element.password))
		// 			System.out.println("Sucssefuly");
		// 		else
		// 			System.out.println("Wrong Password!");
		// 	} else {
		// 		System.out.println("Wrong Username or Not verfied yet!");
		// 	}
		// }
	}
	
	public void AddVerfied(Driver d) {
		LocalSaving.PendingDriversList.remove(d);
		this.Local.AddVerfiedDrivers(d);
	}
	public ArrayList<Driver> getPendingList() {
		return LocalSaving.PendingDriversList;
	}

	@Override
	public void SetDBSmethod(DatabaseSavingMethods DBS) {
		this.DBS1 = DBS;
		
	}

	public List<Driver> getAllDriv() {
		return Local.getAllDrivers();
	}

	public boolean removeDriv(int id) {
		return Local.RemoveDriver(id);
	}

	public Boolean drivlogin(String un, String pass) {
		return Local.DriverLogin(un,pass);
	}

	public List<Driver> getALLDrivv() {
		return Local.getAllDriversv();
	}

	public boolean removeDrivv(int id) {
		return Local.RemoveDriverUn(id);
	}

    public boolean AddFav(String fav,int id) {
        return Local.addFavArea(fav,id);
    }

	public List<Ride> AllridesinFav(int id) {
		return Local.RideinFav(id);
	}


	// public boolean verifyDriver(int id) {
	// 	Driver driver = new Driver();
	// 	driver = Local.getUnverfiedDriv(id);

	// 	driver.setVerificationStatus(true);
	// 	Local.RemoveDriver(id);
	// 	return Local.AddVerfiedDrivers(driver);
		
	// }

}
