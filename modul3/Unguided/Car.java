/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3.Unguided;

/**
 *
 * @author USER
 */

// Kelas Car merepresentasikan sebuah mobil dan komponen-komponennya
public class Car {
    private String brand; // Merek mobil
    private String model; // Model mobil
    private Engine engine; // Objek engine dari kelas Engine
    private Transmission transmission; // Objek transmission dari kelas Transmission
    private Brakes brakes; // Objek brakes dari kelas Brakes
    private Wheels wheels; // Objek wheels dari kelas Wheels

    // Konstruktor untuk inisialisasi objek Car
    public Car(String brand, String model, Engine engine, Transmission transmission, Brakes brakes, Wheels wheels) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
        this.brakes = brakes;
        this.wheels = wheels;
    }

    // Method untuk menampilkan informasi mobil
    public void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Engine Type: " + engine.getType() + " - " + engine.getHorsepower() + " HP");
        System.out.println("Transmission Type: " + transmission.getType() + " with " + transmission.getGears() + " gears");
        System.out.println("Brakes Type: " + brakes.getType() + " (Efficiency: " + brakes.getEfficiency() + "%)");
        System.out.println("Wheels: " + wheels.getCount() + " wheels, Size: " + wheels.getSize() + " inches");
    }
}

// Atribut di semua kelas dibuat private dan akses dilakukan melalui getter untuk menjaga keamanan data dan tidak tercampur