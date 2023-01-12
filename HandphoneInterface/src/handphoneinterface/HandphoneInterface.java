package handphoneinterface;
import java.util.Scanner;
/**
 * @author Anang Misbakhul Khoir
 * 09040620047
 */
public class HandphoneInterface {

    public static void main(String[] args) {
        
        
        // membuat objek HP
        Phone redmiNote8 = new Xiaomi();
        Phone iPhone6 =  new iPhone();

        // membuat objek user
        PhoneUser Nopal = new PhoneUser(redmiNote8);
        PhoneUser Yohan = new PhoneUser(iPhone6);

        // kita coba nyalakan HP-nya
        Nopal.NyalakanHandphone();
        Yohan.NyalakanHandphone();
        
        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi_1; 
        
        
        while (true) {
            System.out.println("\n=== APLIKASI INTERFACE XIAOMI ===");
            System.out.println("1. Nyalakan HP");
            System.out.println("2. Matikan HP");
            System.out.println("3. Perbesar Volume");
            System.out.println("4. Kecilkan Volume");
            System.out.println("0. Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi : ");
            aksi_1 = input.nextLine();
            
            if(aksi_1.equalsIgnoreCase("1")){
                Nopal.NyalakanHandphone();
            } else if (aksi_1.equalsIgnoreCase("2")){
                Nopal.MatikanHandphone();
            } else if (aksi_1.equalsIgnoreCase("3")){
                Nopal.TinggikanVolume();
            } else if (aksi_1.equalsIgnoreCase("4")){
                Nopal.TurunkanVolume();
            } else if (aksi_1.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }  
        }  
    }
}