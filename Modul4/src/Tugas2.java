import java.util.Scanner;

public class Tugas2 {
//    public static void konversi() {
//        Tugas2 obj = new Tugas2();
//        //Jika input yang dimasukkan lebih dari sama dengan 1 tahun
//        if(obj.getInput() >=365){
//            obj.daytoYear(obj);
//            obj.daytoYear_Day(obj, obj.getInput() % 365);
//            obj.daytoYear_Month(obj, (obj.getInput() % 365));
//            obj.daytoYear_Month_Day(obj, (obj.getInput() % 365) - (30 * obj.getBulan()));
//        }//Jika input yang dimasukkan lebih dari sama dengan 1 bulan dan kurang dari 1 tahun
//        else if (obj.getInput() <365&& obj.getInput() >=30) {
//            obj.daytoMonth(obj, obj.getInput());
//            obj.daytoMonth_Day(obj, obj.getInput() % 30);
//        } //Jika input yang dimasukkan lebih dari sama dengan satu hari dan kurang dari 1 bulan
//        else if (obj.getInput() <30&& obj.getInput() >=1) {
//            obj.daytoDay(obj, obj.getInput());
//        }
//    }

    public void daytoDay(Main obj, int obj1) {
        //Konversi hari ke hari
        obj.setHari(obj1);
    }

    public void daytoMonth_Day(Main obj, int obj1) {
        //Konversi hari ke bulan dan hari
        obj.setHari(obj1);
    }

    public void daytoMonth(Main obj, int obj1) {
        //Konversi hari ke bulan
        obj.setBulan(obj1 /30);
    }

    public void daytoYear_Month_Day(Main obj, int obj1) {
        //Konversi hari ke tahun, bulan, dan hari
        obj.setHari(obj1);
    }

    public void daytoYear_Month(Main obj, int obj1) {
        //Konversi hari ke tahun dan bulan
        obj.setBulan(obj1 /30);
    }

    public void daytoYear_Day(Main obj, int obj1) {
        //Konversi hari ke tahun dan hari
        obj.setHari(obj1);
    }

    public void daytoYear(Main obj) {
        //Konversi hari ke tahun
        obj.setTahun(obj.getInput() /365);
    }

//    Scanner inputUser = new Scanner(System.in);
//        System.out.print("Masukkan hari : ");
//    obj.input = inputUser.nextInt();
//        if(obj.input>=365){
//        obj.tahun= obj.input/365;
//        if(obj.input%365==0){
//            System.out.println(obj.input+" hari = "+ obj.tahun +" tahun");
//        }else if(obj.input%365<30){
//            obj.hari= obj.input%365;
//            System.out.println(obj.input+" hari = "+ obj.tahun +" tahun "+ obj.hari+" hari");
//        }
//        else {
//            obj.bulan=(obj.input%365)/30;
//            if((obj.input%365)%30==0){
//                System.out.println(obj.input+" hari = "+ obj.tahun +" tahun "+obj.bulan +" bulan");
//            }else {
//                obj.hari= (obj.input%365)-(30* obj.bulan);
//                System.out.println(obj.input+" hari = "+ obj.tahun +" tahun "+obj.bulan +" bulan "+ obj.hari+" hari");
//            }
//        }
//    } else if (obj.input<365&&obj.input>=30) {
//        obj.bulan= obj.input/30;
//        if(obj.input%30==0){
//            System.out.println(obj.input+" hari = "+ obj.bulan+" bulan");
//        }else {
//            obj.hari=obj.input%30;
//            System.out.println(obj.input+" hari = "+ obj.bulan+" bulan "+ obj.hari+" hari");
//        }
//    } else if (obj.input<30&&obj.input>=1) {
//        obj.hari= obj.input;
//        System.out.println(obj.input+" hari = "+ obj.hari+" hari");
//    }else {
//        System.out.println("Your input not valid");
//    }
}