/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.rataratanilai;
import java.util.Scanner;
/**
 *
 * @author Dandi Ahmadin
 */
public class RataRataNilai {
    private int nilaiMhs[];
    private double jumlahNilai;
    
    public void setJumlahMhs(int jumlah) {
        nilaiMhs = new int[jumlah];
    }
    
    private double rataNilai() {
        return jumlahNilai / nilaiMhs.length;
    }
    
    private void inputNilai() {
        Scanner keyboard = new Scanner (System.in);
//        banyakMhs = new int[jumlah];
        for(int i = 0 ; i < nilaiMhs.length; i++) {
            System.out.print("Nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = keyboard.nextInt();
            jumlahNilai += nilaiMhs[i];
        }
    }
    
    public void tampilHasil() {
        inputNilai();
        System.out.println("\nMaka, Rata-rata Nilainya adalah " + rataNilai());
        System.out.println("Developed by : Dandi Ahmadin");
    }
}
