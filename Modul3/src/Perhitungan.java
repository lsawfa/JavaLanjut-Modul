public class Perhitungan{
    public Perhitungan(){
//        float luas, volume;
//        Balok sisi = new Balok();
//
//        float panjang = sisi.getPanjang();
//        float lebar = sisi.getLebar();
//        float tinggi = sisi.getTinggi();
//        luas=panjang*lebar*tinggi;
//
//        float panjangV = sisi.getPanjang();
//        float lebarV = sisi.getLebar();
//        float tinggiV = sisi.getTinggi();
//        volume=panjangV*lebarV*tinggiV;
    }

    public double hitungVolume(Balok sisi) {
        return sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
    }

    public double hitungLuas(Balok sisi) {
        return 2*(sisi.getPanjang() * sisi.getLebar() + sisi.getPanjang() * sisi.getTinggi() + sisi.getLebar() * sisi.getTinggi());
    }
}