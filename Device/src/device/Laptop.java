package device;

/**
 * @author Anang Misbakhul Khoir
 */
class Laptop extends Komputer{
    private String Procecor, Bit;
    
    public Laptop(String Procecor,String Bit){
        this.Procecor = Procecor;
        this.Bit = Bit;
    }
    public void CPU(){
        System.out.println("\nLaptop Menggunakan CPU : " + Procecor);
        System.out.println("Laptop Menggunakan Bit : " + Bit);
    }
}
