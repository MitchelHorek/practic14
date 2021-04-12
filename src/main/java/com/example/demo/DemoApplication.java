package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class DemoApplication {
    public static ArrayList<Address> addresses = new ArrayList<>();
    public static ArrayList<Building> buildings = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    //public void addAddress(String addressText, String zipCode){
    // Address address = new Address(addressText,zipCode);
}

