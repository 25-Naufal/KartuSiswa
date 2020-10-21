/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartu.siswa;

/**
 *
 * @author ASUS X450JN
 */
import java.util.Scanner;
public class KartuSiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama,ttl,agama, alamat, nisn, jeniskelamin;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("        SMK Telkom Malang    ");
        System.out.println("         Kartu Pelajar    ");
        System.out.println("      --------------------    ");
        
        System.out.print("Nama              : ");
        nama = input.nextLine();
         
        System.out.print("NISN              : ");
        nisn = input.nextLine();
        
        System.out.print("Tempat, Tgl lahir : ");
        ttl = input.nextLine();
        
        System.out.print("Alamat            : ");
        alamat = input.nextLine();
    }
    
}
