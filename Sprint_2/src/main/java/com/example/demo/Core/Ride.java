package com.example.demo.Core;

import java.util.ArrayList;

public class Ride {
	public String Source;
	public int Price;
	public String Destination;
	public String Title;
	public String Description;
	public ArrayList<Integer> ListofOffers = new ArrayList<Integer>();
    public	int id;

	public void RequestRide(String source, String destination) {
		this.Source = source;
		this.Destination = destination;
		
	}

	void SetOffer(int offer) {
		ListofOffers.add(offer);
	}

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }

    public String getSource() {
        return Source;
    }

    public String getDestination() {
        return Destination;
    }
}
