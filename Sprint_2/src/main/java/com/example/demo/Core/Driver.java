package com.example.demo.Core;


import java.util.ArrayList;

import com.example.demo.Persistence.LocalSaving;

public class Driver extends User {
	public int id;
	public String DrivingLicence;
	public String NationalID;
	public Boolean VerificationStatus;
	public ArrayList<String> FavoriteAreasList = new ArrayList<String>();
	private Ride[] history;

	public Driver() {

		username = null;
		email = null;
		password = null;
		mobilenumber = null;
		DrivingLicence = null;
		NationalID = null;
		VerificationStatus = false;

	}
	public Driver(String un,String e,String pass,String mn,String dl,String nid){
		username = un;
		email = e;
		password = pass;
		mobilenumber = mn;
		DrivingLicence = dl;
		NationalID = nid;
		VerificationStatus = false;
	}

	public void setVerificationStatus(Boolean verificationStatus) {
		VerificationStatus = verificationStatus;
	}

	public boolean AddFavArea(String area) {

		return FavoriteAreasList.add(area);
	}

	public ArrayList<Ride> getRides() {
		ArrayList<Ride> RidesInFav = new ArrayList<Ride>();
		for (String element : FavoriteAreasList) {
			for (Ride r : LocalSaving.RidesList) {
				if (element.equals(r.Source)) {
					RidesInFav.add(r);
				} else {
					System.out.println("No any Rides");
					return null;
				}
			}
		}
		return RidesInFav;
	}

    public void setId(int id){
        this.id= id;
    }
	public String getUserName() {
		return username;
	}
    public String getPassword() {
        return password;
    }

	public void setVerificationStatus(boolean ver){
        VerificationStatus= ver;
    }
}