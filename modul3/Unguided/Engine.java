/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3.Unguided;

/**
 *
 * @author USER
 */

// Kelas Engine merepresentasikan mesin mobil
// Engine memiliki atribut tipe mesin dan horsepower (daya mesin)
public class Engine {
    private String type; // Tipe mesin (misalnya Petrol, Diesel, Electric)
    private int horsepower; // Daya mesin dalam satuan HP (Horsepower)

    // Konstruktor untuk inisialisasi atribut Engine
    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    // Getter untuk mendapatkan tipe mesin
    public String getType() {
        return type;
    }

    // Getter untuk mendapatkan horsepower
    public int getHorsepower() {
        return horsepower;
    }
}