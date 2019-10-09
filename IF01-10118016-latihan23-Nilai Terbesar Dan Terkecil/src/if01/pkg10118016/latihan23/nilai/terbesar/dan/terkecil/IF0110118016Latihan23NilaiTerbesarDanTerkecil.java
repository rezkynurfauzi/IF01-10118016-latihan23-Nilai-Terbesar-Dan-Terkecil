/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan23.nilai.terbesar.dan.terkecil;
import java.util.Scanner;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program Nilai Terbesar Dan Terkecil
 */

public class IF0110118016Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        int jumlahMhs;
        int[] nilaiMhs = new int[10];
        int terbesar = 0;
        int terkecil = 100;
        
        //imasukkan
        System.out.println("========PROGRAM NILAI TERBESAR DAN TERKECIL MAHASISWA========");
        System.out.print("Masukkan nama petugas : ");
        Scanner tempNama = new Scanner(System.in);
        nama = tempNama.nextLine();
        
        System.out.print("Masukkan banyaknya nilai mahasiswa : ");
        Scanner tempJmlh = new Scanner(System.in);
        jumlahMhs =  tempJmlh.nextInt();
        
        //proses
        for (int i = 1;i <= jumlahMhs;i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke - " + i + " : ");
            Scanner tempNilai = new Scanner(System.in);
            nilaiMhs[i] = tempNilai.nextInt();
            if(nilaiMhs[i] > terbesar ){
                 terbesar = nilaiMhs[i];
            } 
           if(nilaiMhs[i] < terkecil){
               terkecil = nilaiMhs[i];
           }
                  
        }
          System.out.println();
        
        //keluaran
        System.out.println("++++++HASIL NILAI MAHASISWA++++++");
        for (int i = 1;i <= jumlahMhs;i++){
            System.out.println("Nilai Mahasiswa Ke - " + i + " = " + nilaiMhs[i]);
            
        }
        System.out.println();
        System.out.println("Nilai Terbesar adalah\t: " + terbesar);
        System.out.println("Nilai Terkecil adalah   : "  + terkecil);
        System.out.println();
        System.out.println("Petugas : " + nama);
    }
    
}
