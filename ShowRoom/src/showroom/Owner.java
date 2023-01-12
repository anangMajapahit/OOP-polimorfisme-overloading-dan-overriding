package showroom;

/**
 * @author Anang Misbakhul Khoir
 * NIM 09040620047
 */
class Owner extends MobilAbstrak {
    @Override   
    public void Penjelasan(){
       System.out.println("Pemilik Pertama : ");
    }
    void spesifikasiKendaraan(){
        System.out.println("Mobil ini tahun 2010");
    }
    void RiwayatService(){
        System.out.println("Pernah Turun mesin dan sudah pembaruan");
    }
    void KilometerKendaraan(){
        System.out.println("90.000Km\n");
    }
}
