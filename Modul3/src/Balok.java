public class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void hasil(){
        Perhitungan ph = new Perhitungan();
        System.out.println("Hasil luas balok : "+ph.hitungLuas(this));
        System.out.println("Hasil volume balok : "+ph.hitungVolume(this));
    }
}
