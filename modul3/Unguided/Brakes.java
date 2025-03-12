/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3.Unguided;

/**
 *
 * @author USER
 */

// Kelas Brakes merepresentasikan sistem pengereman mobil
// Brakes memiliki atribut jenis rem dan efektivitas rem
public class Brakes {
    private String type; // Jenis rem (Disk, Drum)
    private int efficiency; // Efektivitas pengereman dalam persent(%)

    // Konstruktor untuk inisialisasi atribut Brakes
    public Brakes(String type, int efficiency) {
        this.type = type;
        this.efficiency = efficiency;
    }

    // Getter untuk mendapatkan jenis rem
    public String getType() {
        return type;
    }

    // Getter untuk mendapatkan efektivitas rem
    public int getEfficiency() {
        return efficiency;
    }
}