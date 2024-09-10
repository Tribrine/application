package com.tribrine.practice;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Traveler {
    private Vehicle vehicle;

    public void startTraveling() {
        this.vehicle.move();
    }
}
