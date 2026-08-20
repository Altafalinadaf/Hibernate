package org.example.embeddable;

import jakarta.persistence.Embeddable;

@Embeddable
public class Laptop {
    String name;
    String model;
    int ram;

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
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
