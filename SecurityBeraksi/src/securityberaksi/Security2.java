package securityberaksi;

/**
 * @author Anang Misbakhul Khoir
 */
public class Security2 extends ScurityGuard{
    String type = "Scurity 2";
    
    Security2(String nama){
        super(nama);
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Type\t : " +this.type);
    }
    void showoff(){
        System.out.println("Saya SCURITY 2, Selamat Datang Pak/Bu...");
    }
}
