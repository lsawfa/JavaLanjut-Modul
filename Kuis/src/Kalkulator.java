import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalkulator extends Exception {
    public Kalkulator(){}
    private double a;
    private double b;
    private double hasil;
    public int menu;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getHasil() {
        return hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    public void operasi(){
        Scanner inputUser = new Scanner(System.in);
        try {
            System.out.printf("a : ");
            setA(inputUser.nextDouble());
            System.out.printf("b : ");
            setB(inputUser.nextDouble());
            if(menu==1){
                setHasil(getA()+getB());
                System.out.println(getA()+" + "+getB()+" = "+getHasil());
            }else if(menu==2){
                setHasil(getA()-getB());
                System.out.println(getA()+" - "+getB()+" = "+getHasil());
            }else if(menu==3){
                setHasil(getA()*getB());
                System.out.println(getA()+" * "+getB()+" = "+getHasil());
            }else if(menu==4){
                if(getB()==0){
                    throw new RuntimeException("Penyebut tidak boleh 0");
                }else {
                    setHasil(getA()/getB());
                    System.out.println(getA()+" / "+getB()+" = "+getHasil());
                }
            }else if(menu==5){
                try {
                    int inputa = (int) getA();
                    int inputb = (int) getB();
                    setHasil(getA()%getB());
                    System.out.println(getA()+" % "+getB()+" = "+getHasil());
                }catch (Exception e){
                    System.out.println("Error : "+e);
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Error: "+e);
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
    }

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        Kalkulator obj = new Kalkulator();
        System.out.println("PROOGRAM KALKULATOR SEDERHANA");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulus");
        System.out.print("Pilih operasi : ");
        try{
            obj.menu = inputUser.nextInt();
            if(obj.menu==1||obj.menu==2||obj.menu==3||obj.menu==4||obj.menu==5){
                obj.operasi();
            }else{
                try {
                    throw new Kalkulator();
                }catch (Kalkulator e){
                    System.out.println("Error: menu tidak tersedia");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Error: "+e);
        }
    }
}