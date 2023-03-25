import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Balok sisi = new Balok();
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Input Panjang\t: ");
        sisi.setPanjang(inputUser.nextDouble());
        System.out.print("Input Lebar\t: ");
        sisi.setLebar(inputUser.nextDouble());
        System.out.print("Input Tinggi\t: ");
        sisi.setTinggi(inputUser.nextDouble());

        sisi.hasil();
    }
}
