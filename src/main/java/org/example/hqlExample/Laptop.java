package org.example.hqlExample;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
    @Id
    int id;
    String name;
    int ram;
    String tech;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Laptops{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ram=" + ram +
                ", tech='" + tech + '\'' +
                '}';
    }
}
