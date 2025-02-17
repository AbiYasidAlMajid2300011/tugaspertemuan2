package com.abiyasidalmajid2300011.tugaspertemuan2;
import java.util.Scanner;

public class JumlahASCII {
    public static void main(String[] args) {
        Scanner MyInput = new Scanner(System.in);
        char karakter1, karakter2;
        
        System.out.print("Masukkan karakter pertama: ");
        karakter1 = MyInput.next().charAt(0);
        System.out.print("Masukkan karakter kedua: ");
        karakter2 = MyInput.next().charAt(0);
        
        int ascii1 = karakter1;
        int ascii2 = karakter2;
        
        System.out.println("Kode ASCII '1': " + ascii1);
        System.out.println("Kode ASCII '2': " + ascii2);
        System.out.println("Jumlah dari kode ASCII '" + karakter1 + "' dan '" + karakter2 + "': " + ascii1 + " + " + ascii2 + " = " + (ascii1 + ascii2));
    }
}
