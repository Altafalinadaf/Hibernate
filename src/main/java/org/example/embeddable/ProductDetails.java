package org.example.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductDetails {
    @Id
    @Column(name = "pid")
    int id;
    String pName;
    int price;
    Laptop laptop;

    public ProductDetails(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "id=" + id +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                ", laptop=" + laptop +
                '}';
    }
}

