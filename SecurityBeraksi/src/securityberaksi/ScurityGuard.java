package securityberaksi;

/**
 * @author Anang Misbakhul Khoir
 */
public class ScurityGuard {
    String nama;
    
    ScurityGuard(String nama){
        this.nama = nama;
    }
    void display(){
        System.out.println("\nNama\t : " + this.nama);
    }
}
