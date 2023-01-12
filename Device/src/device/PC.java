package device;

/**
 * @author Anang Misbakhul Khoir
 */
public class PC extends Komputer{
    private String Procecor, Bit;
    
    public PC(String Procecor,String Bit){
        this.Procecor = Procecor;
        this.Bit = Bit;
    }
    public void CPU(){
        System.out.println("PC Menggunakan CPU : " + Procecor);
        System.out.println("PC Menggunakan Bit : " + Bit);
    }
}
