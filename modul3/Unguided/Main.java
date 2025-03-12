/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3.Unguided;

/**
 *
 * @author USER
 */

// Kelas Main untuk menjalankan program utama
public class Main {
    public static void main(String[] args) {
        // Membuat objek Engine
        Engine carEngine = new Engine("Petrol", 113); // tipe: "Petrol", daya: 113 HP

        // Membuat objek Transmission
        Transmission carTransmission = new Transmission("Manual", 6); // tipe: "Manual" dan 6 gigi

        // Membuat objek Brakes (rem cakram dengan efektivitas 85%)
        Brakes carBrakes = new Brakes("Disk", 85); // rem cakram/disk dengan efektivitas 85%

        // Membuat objek Wheels
        Wheels carWheels = new Wheels(4, 16); // jumlah roda: 4 dengan diameter 16 inches

        // Membuat objek Car
        Car myCar = new Car("Hyundai", "Creta", carEngine, carTransmission, carBrakes, carWheels);

        // Memanggil method untuk menampilkan informasi mobil
        myCar.displayCarInfo();
    }
}