package handphoneinterface;

/**
 * @author Anang Misbakhul Khoir
 */
public class iPhone implements Phone {
    
    private int volume;
    private boolean isPowerOn;

    public iPhone() {
        // set volume awal
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("\nHandphone menyala...");
        System.out.println("-==WELCOME IPHONE==-");
        System.out.println("Version Software 14.5\n");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == Max_Volume) {
                System.out.println("Volume FULL!1!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan Dulu HP-nya!!!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == Min_Volume) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang : " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan Dulu HP-nya!!!");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
