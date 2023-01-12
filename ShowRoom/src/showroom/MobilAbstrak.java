package showroom;

/**
 * @author Anang Misbakhul Khoir
 * NIM 09040620047
 */
public abstract class MobilAbstrak {
    String NomorPlat;
    
    abstract void Penjelasan();
    
    public String getNomorPlat(){
        return NomorPlat;
    } 
    public void setNomorPlat(String NomorPlat){
        this.NomorPlat = NomorPlat;
    }
}
