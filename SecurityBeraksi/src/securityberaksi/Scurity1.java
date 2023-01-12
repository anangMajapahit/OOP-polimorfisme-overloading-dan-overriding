package securityberaksi;

/**
 * @author Anang Misbakhul Khoir
 */
public class Scurity1 extends ScurityGuard{
    String type = "Scurity 1";
    
    Scurity1(String nama){
        super(nama);
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Type\t : " +this.type);
    }
    void showoff(){
        System.out.println("Saya SCURITY 1, Tunjukkan ID kamu !!!");
    }
}
