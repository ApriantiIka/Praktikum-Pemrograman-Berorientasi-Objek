/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3.Unguided;

/**
 *
 * @author USER
 */

// Kelas Transmission merepresentasikan sistem transmisi mobil
// Transmission memiliki atribut jenis transmisi dan jumlah gigi
public class Transmission {
    private String type; // Jenis transmisi (Manual, Automatic)
    private int gears; // Jumlah gigi dalam transmisi

    // Konstruktor untuk inisialisasi atribut Transmission
    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    // Getter untuk mendapatkan jenis transmisi
    public String getType() {
        return type;
    }

    // Getter untuk mendapatkan jumlah gigi
    public int getGears() {
        return gears;
    }
}