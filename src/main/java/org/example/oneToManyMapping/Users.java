package org.example.oneToManyMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Users {
    @Id
    int uid;
    String uname;
    String tech;
    @OneToMany
    List<Laptop> laptops;

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }



    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
