package com.abiyasidalmajid2300011.tugaspertemuan2;

public class JumlahASCII {
    public static void main(String[] args) {
        char karakter1 = '1', karakter2 = '2';
        
        int ascii1 = karakter1;
        int ascii2 = karakter2;
        
        System.out.println("Kode ASCII '1': " + ascii1);
        System.out.println("Kode ASCII '2': " + ascii2);
        System.out.println("Jumlah dari kode ASCII '1' dan '2': " + ascii1 + " + " + ascii2 + " = " + (ascii1 + ascii2));
    }
}