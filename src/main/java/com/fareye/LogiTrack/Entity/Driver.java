package com.fareye.LogiTrack.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String ph_number;
    private String licensenumber;
    private String Vehicle_number;

    public Driver() {
    }

    public Driver(Long id, String name, String email, String ph_number, String licensenumber, String vehicle_number) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.ph_number = ph_number;
        this.licensenumber = licensenumber;
        Vehicle_number = vehicle_number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPh_number() {
        return ph_number;
    }

    public void setPh_number(String ph_number) {
        this.ph_number = ph_number;
    }

    public String getLicensenumber() {
        return licensenumber;
    }

    public void setLicensenumber(String licensenumber) {
        this.licensenumber = licensenumber;
    }

    public String getVehicle_number() {
        return Vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        Vehicle_number = vehicle_number;
    }
}
