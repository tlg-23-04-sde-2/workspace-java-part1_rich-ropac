package com.transportation;

class BoatClient {

    public static void main(String[] args) {
        Vehicle boat = new Boat("Preacher");
        boat.moveTo("West Seattle");
    }
}