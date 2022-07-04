package com.example.demo.Core;

import com.example.demo.application.DriverService;

public class Admin extends User {
	private Driver_Manager dm = DriverService.dManager;

	public boolean verifyDriver(int id) {
		Driver driver = new Driver();
		driver = dm.Local.getUnverfiedDriv(id);

		driver.setVerificationStatus(true);
		dm.Local.RemoveDriverUn(id);
		return dm.Local.AddVerfiedDrivers(driver);
		
	}

};
