/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3.Unguided;

/**
 *
 * @author USER
 */

// Kelas Wheels merepresentasikan roda mobil
// Wheels memiliki atribut jumlah roda dan ukuran roda
public class Wheels {
    private int count; // Jumlah roda
    private int size; // Ukuran diameter roda (inch)

    // Konstruktor untuk inisialisasi atribut Wheels
    public Wheels(int count, int size) {
        this.count = count;
        this.size = size;
    }

    // Getter untuk mendapatkan jumlah roda
    public int getCount() {
        return count;
    }

    // Getter untuk mendapatkan ukuran roda
    public int getSize() {
        return size;
    }
}