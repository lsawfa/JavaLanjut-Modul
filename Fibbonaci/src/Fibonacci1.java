/*Nama: Larynt Sawfa Kenanga
  MIM: 202110370311189
  Kelas: Algoritma Pemrograman D*/

//PROGRAM BILANGAN FIBBONACI MENGGUNAKAN WHILE
//Program bilangan fibonacci selain menggunakan for dan while bisa juga menggunakan fungsi rekursif,
//tapi fungsi rekursif memakan memori yang besar jadi disini saya menggunakan while

import java.util.Scanner;
public class Fibonacci1 {
    public int nbarisan, a1=1, a2, a3;
    public void barisfibonacci(int n){
        while (n!=0){
            a3=a1+a2;
            a1=a2;
            a2=a3;
            n--;
            if(n==0){
                System.out.println(a1);
            }else {
                System.out.print(a1+", ");
            }
        }
    }
    public static void main(String[] args) {
        Fibonacci1 obj = new Fibonacci1();
        Scanner inputUser = new Scanner(System.in);
        System.out.println("=== PROGRAM BILANGAN FIBONACCI ===");
        System.out.print("Barisan suku bilangan yang ditampilkan : ");
        obj.nbarisan=inputUser.nextInt();
        obj.barisfibonacci(obj.nbarisan);
    }
}