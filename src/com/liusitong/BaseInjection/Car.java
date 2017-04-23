package com.liusitong.BaseInjection;

/**
 * Created by LiuSitong on 2017/4/23.
 */
public class Car {
    String brand ;
    int maxSpeed;
    double price;

    public Car() {
    }

    public Car(String brand, int maxSpeed, double price) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
