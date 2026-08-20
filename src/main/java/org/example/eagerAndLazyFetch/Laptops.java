package org.example.eagerAndLazyFetch;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Laptops {
    @Id
    private int id;
    private String name;
    private int ram;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Laptops{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ram=" + ram +
                '}';
    }
}
