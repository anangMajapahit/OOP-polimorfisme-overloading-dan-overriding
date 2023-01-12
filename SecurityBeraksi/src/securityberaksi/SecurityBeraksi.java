package securityberaksi;

/**
 * @author Anang Misbakhul Khoir
 */
public class SecurityBeraksi {

    public static void main(String[] args) {
    
        ScurityGuard Satpam = new ScurityGuard("Muhammad Ali");
        Scurity1 Satpam1 = new Scurity1("Osama");
        Security2 Satpam2 = new Security2("Shidiq");
        Security3 Satpam3 = new Security3("Umar");
        Satpam.display();
        
        Satpam1.display();
        Satpam1.showoff();
        Satpam2.display();
        Satpam2.showoff();
        Satpam3.display();
        Satpam3.showoff();
        
        //Pholymorphic
        ScurityGuard Penjaga1 = new Scurity1("Rianto");
        Penjaga1.display();
        
        
        ScurityGuard Penjaga2 = new Security2("Agus");
        Penjaga2.display();
        
        ScurityGuard Penjaga3 = new Security3("Brudin");
        Penjaga3.display();
        
    }
}
