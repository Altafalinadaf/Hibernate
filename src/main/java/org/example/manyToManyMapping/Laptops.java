package org.example.manyToManyMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Laptops {
    @Id
    private int id;
    private String brand;
    private int ram;
    @ManyToMany(mappedBy = "laptops")
    private List<Users> users;

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

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Laptops{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", ram=" + ram +
                '}';
    }
}
