package showroom;

/**
 * @author Anang Misbakhul Khoir
 * NIM 09040620047
 */
public class ShowRoom {
    
    public static void main(String[] args) {
        Pendaftaran Daftar = new Pendaftaran();
        PersonilGarasi Showroom = new PersonilGarasi();
        Owner Pemilik = new Owner();
        
        Pemilik.Penjelasan();
        Pemilik.spesifikasiKendaraan();
        Pemilik.RiwayatService();
        Pemilik.KilometerKendaraan();
        
        Daftar.Penjelasan();
        Daftar.setNomorPlat("S 09040620047 MJK");
        System.out.println(Daftar.getNomorPlat());
        Daftar.PemilikSekarang();
        Daftar.IdKendaraan();
        Daftar.Tanggal();
        
        Showroom.Penjelasan();
        Showroom.setNomorPlat("S 09040620047 MJK");
        System.out.println(Showroom.getNomorPlat());
        Showroom.Pekerjaan();
        Showroom.Tagihan();
        Showroom.Pemilik();
    }
}
