// KONVERSI TIPE DATA PADA JAVA khusus numeric
// konversi ini bermaksud untuk mengubah tipe data menjadi lebih besar
package com.belajar6;

public class main {
    public static void main(String[] args){
        System.out.println("==================================");
        System.out.println("BELAJAR MEMAHAI KONFERSI TIPE DATA");
        System.out.println("==================================");

        //deklarasi
        byte b = 2;
        short s = 5;
        int a = 10;
        long l = 1;
        float f = 2;
        double d = 308979767; // <-- CONTOH DATA YANG BESAR

        // konversi nilai dari data kecil ke data besar
        l = (long) a; // cara konversi denga menambah (long) atau mencamtumkan tipe data yang akan dikonversi

        // konversi nilai dari data besar ke data kecil
        a = (int) l; // cara konversi denga menambah (int) atau mencamtumkan tipe data yang akan dikonversi

        //ini berlaku pada tipe data numeric saja..!!!!!!
        //BILA NILAI AKAN DIKONVERSI DARI DATA YANG BESAR MENUJU DATA KECIL TAPI DATA TERLALU BESAR MAKA NILAI AKAN
        //MELEBIHI MUATAN DAN MENJADI DATA MEMBLUDAK.


    }
}
