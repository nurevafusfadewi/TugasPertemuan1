/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import static java.lang.System.exit; 
import java.util.Scanner;


/**
 *
 * @author Asus
 */
public class Main {
   public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String nama,nim;
    int usia,uts,uas,pilih;
    
    System.out.println("===== input data =====");
    System.out.print("Nama\t:"); nama = input.nextLine(); 
    System.out.print("Nim\t:"); nim = input.nextLine();
    System.out.print("Usia\t:"); usia = input.nextInt();
    System.out.print("Uts\t:"); uts = input.nextInt();
    System.out.print("Uas\t:"); uas = input.nextInt();
    
    Mahasiswa mahasiswa = new Mahasiswa (nama,nim,usia,uts,uas);
    
    do{
        
        System.out.println("");
        System.out.println("");
        System.out.println("===== Menu =====");
        System.out.println("1. Tampilkan data");
        System.out.println("2. edit data");
        System.out.println("3. exit");
        System.out.println("pilih : ");pilih =input.nextInt();
        
        if (pilih==1) {
            System.out.println("");
            System.out.println("");
            System.out.println("Perkenalkan nama saya" + mahasiswa.nama + "Nim" + mahasiswa.nim);
            System.out.println("Usia\t:"+mahasiswa.usia);
            System.out.println("Nilai akhir\t;" + mahasiswa.nilaiAkhir());
        }
        
        else if (pilih==2){
            
            input = new Scanner(System.in);
            System.out.println("");
            System.out.println("");
            System.out.println("===== Input data =====");
            System.out.println("Nama\t"); mahasiswa.nama = input.nextLine();
            System.out.println("Nin\t"); mahasiswa.nim = input.nextLine();
            System.out.println("Usia\t"); mahasiswa.usia= input.nextInt();
            System.out.println("Uts\t"); mahasiswa.uts= input.nextInt();
            System.out.println("Uas\t"); mahasiswa.uas= input.nextInt();
            
        }
        
    }while(pilih!=3); 
}
}
