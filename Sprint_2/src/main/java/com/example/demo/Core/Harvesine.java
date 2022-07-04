package com.example.demo.Core;

public class Harvesine implements IETA{

    private int Speed;
    private int Distance;
    private int x;


    @Override
    public void CalcETA() {
        x = Speed/Distance;
    }
    
}
