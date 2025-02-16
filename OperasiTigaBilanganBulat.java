package com.abiyasidalmajid2300011.tugaspertemuan2;
import java.util.Scanner;

public class OperasiTigaBilanganBulat {

    public static void main(String[] args) {
        Scanner MyInput = new Scanner(System.in);
        int a, b, c;
        
        System.out.print("Masukkan bilangan pertama: ");
        a = MyInput.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        b = MyInput.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        c = MyInput.nextInt();
        
        System.out.println("Hasil penjumlahan: " + a + " + " + b + " + " + c + " = " + (a + b + c));
        System.out.println("Hasil pengurangan: " + a + " - " + b + " - " + c + " = " + (a - b - c));
        System.out.println("Hasil perkalian: " + a + " * " + b + " * " + c + " = " + (a * b * c));
        if (b == 0 || c ==0) {
            System.out.println("Tidak boleh membagi dengan nol.");
        } else {
            System.out.println("Hasil pembagian: " + a + " / " + b + " / " + c + " = " + ((double) a / b / c));
        }
    }
}