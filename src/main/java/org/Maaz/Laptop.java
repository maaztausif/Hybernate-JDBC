package org.Maaz;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Laptop {

    @Id
    private  int id;
    private String band;
    private String model;
    private int ram;


    public String getBand() {
        return band;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "band='" + band + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
