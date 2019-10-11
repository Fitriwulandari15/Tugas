
package scannerulan;

import java.util.Scanner;


public class Scannerulan {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
            System.out.println("Apakah Merk Motor Saya ? ");
                String merk = scan.nextLine();
        
            System.out.println("Merk Motor saya ialah > " + merk);
        
        System.out.println("Masukkan Harga CPU ? ");
            int cpu = scan.nextInt();
        
        System.out.println("Harga CPU Ini : " + cpu);
        
    }
}
