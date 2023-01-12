package handphoneinterface;

/**
 * @author Anang Misbakhul Khoir
 */
public class Xiaomi implements Phone {

    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        // set volume awal
        this.volume = 70;
    }
    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("\nHandphone Menyala...");
        System.out.println("WELCOME IN XIAOMI");
        System.out.println("Android version 11\n");
    }
    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("XIAOMI SHUTDOWN");
    }
    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == Max_Volume) {
                System.out.println("Volume FULL!!!");
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
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan Dulu HP-nya!!!");
        }
    }
    public int getVolume() {
        return this.volume;
    }
}
