/*
*KalkulatorBangunDatar.java
* Program ini berisi tentang:
* 1. Menghitung luas dan keliling persegi panjang
* 2. Menghitung luas dan keliling lingkaran
* 3. Menentukan apakah luas persegi panjang lebih dari 100
 */

import java.util.Scanner;

public class KalkulatorBangunDatar {

    public static void main(String[] args){

        Scanner input = new Scanner( System.in);

        // 1. Menghitung luas dan keliling persegi panjang
        System.out.println("1. Menghitung Luas dan keliling Persegi panjang\n");

        System.out.print("Masukkan panjang persegi panjang : ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang : ");
        double lebar = input.nextDouble();

        // Rumus luas dan keliling persegi panjang
        double luas = panjang * lebar;
        double keliling = 2 * panjang + lebar;

        System.out.println("\nLuas Persegi Panjang : " + luas);
        System.out.println("Keliling Persegi Panjang : " + keliling);

        // 2. Menghitung luas dan keliling lingkaran
        System.out.println("\n\n 2. Menghitung Luas dan Keliling Lingkaran\n");

        System.out.print("Masukkan jari-jari lingkaran : ");
        double jariJari = input.nextDouble();

        // Rumus luas dan keliling lingkaran
       double luaslingkaran =  Math.PI * jariJari * jariJari;
       double kelilingLingkaran = 2 * Math.PI * jariJari;

       System.out.println("\nLuas Lingkaran : " + luaslingkaran);
       System.out.println("Keliling Lingkaran :" + kelilingLingkaran);

       // 3.Menentukan apakah luas persegi panjang lebih dari 100
        boolean luasBesar = luas > 100;

        System.out.println("\n3. Apakah luas persegi panjang > 100? : " + luasBesar);

        input.close();



    }
}