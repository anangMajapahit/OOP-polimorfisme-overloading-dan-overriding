package handphoneinterface;

/**
 * @author Anang Misbakhul Khoir
 */
public class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }
    
    void NyalakanHandphone(){
        this.phone.powerOn();
    }
    
    void MatikanHandphone(){
        this.phone.powerOff();
    }
    
    void TinggikanVolume(){
        this.phone.volumeUp();
    }
    
    void TurunkanVolume(){
        this.phone.volumeDown();
    }
}
