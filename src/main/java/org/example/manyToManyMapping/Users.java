package org.example.manyToManyMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Users {
    @Id
    int id;
    String name;
    String tech;
    @ManyToMany
    List<Laptops> laptops;

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

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptops> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptops> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
