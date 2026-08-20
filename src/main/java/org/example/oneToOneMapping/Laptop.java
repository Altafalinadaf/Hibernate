package org.example.oneToOneMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
    @Id
    int id;
    String brand;
    int ram;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", ram=" + ram +
                '}';
    }
}
