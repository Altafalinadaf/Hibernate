package org.example.oneToOneMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Users {
    @Id
    int uid;
    String uName;
    String tech;
    @OneToOne
    Laptop laptop;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uName='" + uName + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptop +
                '}';
    }


    public void setLaptops(List<Laptop> list) {
    }
}
