/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.rataratanilai;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menghitung rata-rata nilai dengan konsep pendekatan berbasis objek
 */
public class IF110119033Latihan37RataRataNilai {

    /**
     * @param args the command line arguments
     */
    private static int jumlahMhs;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        RataRataNilai rataNilai = new RataRataNilai();
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        jumlahMhs = input.nextInt();
        rataNilai.setJumlahMhs(jumlahMhs);
        
        rataNilai.tampilHasil();
        
        
    }
    
}
