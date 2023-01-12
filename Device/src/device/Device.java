package device;
/**
 * @author Anang Misbakhul Khoir
 */
public class Device {
    public void cekKomputer(Komputer DevKom){
        DevKom.CPU();
        DevKom.Kebutuhan();
    }
    
    public static void main(String[] args) {
        Device tDevice = new Device();
        
        tDevice.cekKomputer(new Laptop("Intel CORE i9","64 Bit"));
        
        System.out.println("==========================");
        tDevice.cekKomputer(new PC("AMD Radeon","86 Bit"));
        
        System.out.println("==========================");
        tDevice.cekKomputer(new NoteBook("CORE i7","64 Bit"));
        
        System.out.println("==========================");
        tDevice.cekKomputer(new Handphone("SnapDragon","64 Bit"));
    }
}