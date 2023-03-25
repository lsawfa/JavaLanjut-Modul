import java.util.Scanner;

public class Main {
    private int input;
    private int tahun;
    private int bulan;
    private int hari;

    public static void main(String[] args) {
        Main obj = new Main();
        Tugas2 obj2 = new Tugas2();
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan hari : ");
        obj.setInput(inputUser.nextInt());
        if (obj.getInput() >= 365) {
            obj2.daytoYear(obj);
            if (obj.getInput() % 365 == 0) {
                obj.print_DtoY(obj.getInput(), obj.getTahun());
            } else if (obj.getInput() % 365 < 30) {
                obj2.daytoYear_Day(obj,obj.getInput() % 365);
                obj.print_DtoYnD(obj.getInput(), obj.getTahun(), obj.getHari());
            } else {
                obj2.daytoYear_Month(obj,(obj.getInput() % 365));
                if ((obj.getInput() % 365) % 30 == 0) {
                    obj.print_DtoYnM(obj.getInput(), obj.tahun, obj.bulan);
                } else {
                    obj2.daytoYear_Month_Day(obj,(obj.getInput() % 365) - (30 * obj.getBulan()));
                    obj.print_DtoYnMnD(obj.getInput(), obj.getTahun(), obj.getBulan(), obj.getHari());
                }
            }
        } else if (obj.getInput() < 365 && obj.getInput() >= 30) {
            obj2.daytoMonth(obj, obj.getInput());
            if (obj.getInput() % 30 == 0) {
                obj.print_DtoM(obj.getInput(), obj.getBulan());
            } else {
                obj2.daytoMonth_Day(obj, obj.getInput() % 30);
                obj.print_DtoMnD(obj.getInput(), obj.getBulan(), obj.getHari());
            }
        } else if (obj.getInput() < 30 && obj.getInput() >= 1) {
            obj2.daytoDay(obj, obj.getInput());
            obj.print_DtoD(obj.getInput(), obj.getHari());
        } else {
            System.out.println("Your input not valid");
        }
    }
    public void print_DtoY(int input, int tahun) {
        System.out.println(input + " hari = " + tahun + " tahun");
    }

    public void print_DtoYnD(int input, int tahun, int hari) {
        System.out.println(input + " hari = " + tahun + " tahun " + hari + " hari");
    }

    public void print_DtoYnM(int input, int tahun, int bulan) {
        System.out.println(input + " hari = " + tahun + " tahun " + bulan + " bulan");
    }

    public void print_DtoYnMnD(int input, int tahun, int bulan, int hari) {
        System.out.println(input + " hari = " + tahun + " tahun " + bulan + " bulan " + hari + " hari");
    }

    public void print_DtoM(int input, int bulan) {
        System.out.println(input + " hari = " + bulan + " bulan");
    }

    public void print_DtoMnD(int input, int bulan, int hari) {
        System.out.println(input + " hari = " + bulan + " bulan " + hari + " hari");
    }

    public void print_DtoD(int input, int hari) {
        System.out.println(input + " hari = " + hari + " hari");
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }
}