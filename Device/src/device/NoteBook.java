package device;

/**
 * @author Anang Misbakhul Khoir
 */
public class NoteBook extends Komputer{
    private String Procecor, Bit;
    
    public NoteBook(String Procecor,String Bit){
        this.Procecor = Procecor;
        this.Bit = Bit;
    }
    public void CPU(){
        System.out.println("\nNoteBook Menggunakan CPU : " + Procecor);
        System.out.println("NoteBook Menggunakan Bit : " + Bit);
    }
}
