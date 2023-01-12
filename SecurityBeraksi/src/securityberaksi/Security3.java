package securityberaksi;

/**
 * @author Anang Misbakhul Khoir
 */
public class Security3 extends ScurityGuard{
    String type = "Scurity 3";
    
    Security3(String nama){
        super(nama);
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Type\t : " +this.type);
    }
    void showoff(){
        System.out.println("Saya SCURITY 3, Selamat Pagi Pak/Bu...");
    }
}
