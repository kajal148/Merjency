package com.kajal.merjency;

public class Hospital {
    public String name, distance, address;

    public Hospital() {
    }

    public Hospital(String name, String link, String description) {
        this.name = name;
        this.distance = link;
        this.address = description;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(String distance){ this.distance = distance;}

    public String getDistance() {
        return distance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
