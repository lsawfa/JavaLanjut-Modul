import java.util.Scanner;

public class Tugas3 {
    public int input, tahun, bulan, hari;
    public static void main(String[] args) {
        Tugas3 obj = new Tugas3();
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan hari : ");
        obj.input = inputUser.nextInt();
        obj.tahun= obj.input/365;
        if(obj.input%365==0){
            System.out.println(obj.input+" hari = "+ obj.tahun +" tahun");
        }else if(obj.input%365<30){
            obj.hari= obj.input%365;
            System.out.println(obj.input+" hari = "+ obj.tahun +" tahun "+ obj.hari+" hari");
        }
        else {
            obj.bulan=(obj.input%365)/30;
            if((obj.input%365)%30==0){
                System.out.println(obj.input+" hari = "+ obj.tahun +" tahun "+obj.bulan +" bulan");
            }else {
                obj.hari= (obj.input%365)-(30* obj.bulan);
                System.out.println(obj.input+" hari = "+ obj.tahun +" tahun "+obj.bulan +" bulan "+ obj.hari+" hari");
            }
        }
    }
}
