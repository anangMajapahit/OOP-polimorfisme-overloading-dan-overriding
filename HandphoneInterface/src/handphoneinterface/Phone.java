package handphoneinterface;

/**
 * @author Anang Misbakhul Khoir
 */
    public interface Phone {
    int Max_Volume = 100;
    int Min_Volume = 0;
    
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}