import java.util.Scanner;

public class BonusKaryawan {
    //x=jam kerja, y=indeksprestasi, z=gaji
    private int x,y;
    private long z;
    private double bonus;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public long getZ() {
        return z;
    }

    public void setZ(long z) {
        this.z = z;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        BonusKaryawan obj = new BonusKaryawan();
        System.out.println("== Welcome to Program Penentuan Bonus Karyawan ==");
        System.out.print("Nama : ");
        String nama = inputUser.nextLine();
        System.out.print("Jam Kerja (jam/minggu) : ");
        obj.setX(inputUser.nextInt());
        System.out.print("Gaji : ");
        obj.setZ(inputUser.nextLong());
        System.out.print("Indeks Prestasi : ");
        obj.setY(inputUser.nextInt());

        if(obj.getX()>=40&&obj.getY()<=9&&obj.getZ()>=0){
            obj.setBonus(2.0* obj.getZ());
            System.out.println("Selamat "+nama+" mendapatkan bonus sebesar "+ obj.getBonus());
        }else if(obj.getX()>=35&&obj.getX()<=40&&obj.getY()<=9&&obj.getZ()>=0){
            obj.setBonus(1.5* obj.getZ());
            System.out.println("Selamat "+nama+" mendapatkan bonus sebesar "+ obj.getBonus());
        }else {
            System.out.println("Maaf "+nama+" belum beruntung mendapatkan bonus");
        }
        System.out.println("Jadi anda akan mendapatkan bonus sebesar : "+obj.getBonus());
    }
}
