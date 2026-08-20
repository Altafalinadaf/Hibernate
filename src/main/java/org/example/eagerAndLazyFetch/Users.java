package org.example.eagerAndLazyFetch;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Users {
    @Id
    private int id;
    private String name;
    private String tech;
    // using set fetch=FetchType.Lazy - by defauly lazy, you can go for eager, see the difference in query
    @OneToMany(fetch = FetchType.LAZY)
    private List<Laptops> laptops;

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
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
