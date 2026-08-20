package org.example.oneToManyMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
    @Id
    int id;
    int ram;
    String model;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", ram=" + ram +
                ", model='" + model + '\'' +
                '}';
    }
}
