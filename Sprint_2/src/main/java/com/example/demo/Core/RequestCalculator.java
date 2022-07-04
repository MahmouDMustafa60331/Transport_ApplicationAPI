package com.example.demo.Core;

public class RequestCalculator {
    private int MaxReq;
    protected IETA ETA;

    public void SetETA(IETA eta){
        
    };
    public void CalcDistance(){
        if (MaxReq>=60) {
            ETA = new Harvesine();
            ETA.CalcETA();
        }else{
            ETA = new GoogleMapsAPI();
            ETA.CalcETA();
        }
    };
    public void GetETA(){
        
    };
}
