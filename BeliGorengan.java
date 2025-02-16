package com.abiyasidalmajid2300011.tugaspertemuan2;
import java.util.Scanner;

public class BeliGorengan {

    public static void main(String[] args) {
        Scanner MyInput = new Scanner(System.in);
        int uang;
        boolean hujan;

        System.out.print("Masukkan jumlah uang: ");
        uang = MyInput.nextInt();

        System.out.print("Apakah di luar sedang hujan? (true/false): ");
        hujan = MyInput.nextBoolean();

        if (uang > 5000 && !hujan) {
            System.out.println("Anda dapat keluar untuk membeli gorengan.");
        } else {
            if (uang > 5000 && hujan) {
                System.out.println("Uang Anda cukup, namun di luar sedang hujan.");
            } else if (uang <= 5000 && !hujan) {
                System.out.println("Cuaca tidak hujan, namun uang Anda tidak cukup.");
            } else {
                System.out.println("Uang Anda kurang dan di luar sedang hujan.");
            }
            System.out.println("Jadi, Anda tidak dapat keluar untuk membeli gorengan.");
        }
    }
}
