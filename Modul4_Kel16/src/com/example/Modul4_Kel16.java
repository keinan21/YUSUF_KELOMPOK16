package com.example;

public class Modul4_Kel16 {
    //non-return type dengan parameter
    static void cetakKelompok(String kelompok) {
        System.out.println(kelompok);
    }
    //non-return type tanpa parameter
    static void cetakHello() {
        System.out.println("Halo Praktikan Pemrograman Dasar 2025 ^^");
    }
    //return type dengan parameter
    static String returnParam(String text) {
        return text;
    }
    //return type tanpa parameter
    static String returnText() {
        return "Hari ini kita akan belajar mengenai Function dan Method";
    }
    public static void main(String[] args) {
        //penggunaan function non-return type dengan mengisi argument pada parameter kelompok
        cetakKelompok("Kelompok 16");
        //penggunaan function non-return type tanpa parameter
        cetakHello();
        //penggunaan function return type dengan mengisi argument pada parameter
        System.out.println(returnParam ("Ini merupakan function return type"));
        //penggunaan function return type tanpa parameter
        System.out.println(returnText());

        // percobaan 2

        System.out.println("_____________________________________");

        ContohKelas objek = new ContohKelas();
        objek.menyapa();
        String printPerkenalan = objek.perkenalan("Yusuf", "Semarang", "Membaca");
        System.out.println(printPerkenalan);
        objek.printUmur(17);
    }
}
