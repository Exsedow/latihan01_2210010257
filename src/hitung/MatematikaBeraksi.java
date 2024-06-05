/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung;

/**
 *
 * @author USER
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika nando = new Matematika(9,1);
        
        System.out.println("Hasil Penjumlahan: " + nando.setPenjumlahan());
        System.out.println("Hasil Pengurangan: " + nando.setPengurangan());
        System.out.println("Hasil Perkalian: " + nando.setPerkalian());
        System.out.println("Hasil Pembagian: " + nando.setPembagian());
    }

}
