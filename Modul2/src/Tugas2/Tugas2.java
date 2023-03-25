package Tugas2;

import java.util.InputMismatchException;
import java.util.Scanner;

// Interface
interface Program {
    public void cekName(String name);
    public void cekFrom(String from);
    public void cekDate(int date);
    public void list();
}
class Tugas2 implements Program {
    String book[]=new String[100];
    String place[]=new String[100];
    String inName, inFrom;
    int inDate, inIndex;
    @Override
    public void cekName(String name) {
        for(int i=0; book[i]!=null;i++){
            if(name.compareTo(book[i])==0){
                System.out.println("Buku tidak berhasil ditambahkan karena sudah pernah ditambahkan");
                break;
            }else {
                book[inIndex+1]=name;
                System.out.println("Buku "+name+" berhasil ditambahkan");
                break;
            }
        }
    }
    @Override
    public void cekFrom(String from) {
        for(int i=0; place[i]!=null;i++){
            if(from.compareTo(place[i])==0){
                System.out.println("Ada beberapa buku di perpustakaan ini yang berasal dari "+place[i]);
            }
        }
    }

    @Override
    public void cekDate(int date) {
        if(date<2018 || date>2022){
            System.out.println("Tahun terbit buku tahun 2018 ke bawah");
        }else {
            System.out.println("Tahun terbit buku anatara tahun 2018-2022");
        }
    }

    @Override
    public void list() {
        System.out.println("List Buku");
        for(int i=0; book[i]!=null;i++){
            System.out.println((i+1)+". "+book[i]);
            inIndex=i;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tugas2 obj = new Tugas2();
        obj.book[0]="This is Book, Malang. 2022";
        obj.place[0]="Malang";
        obj.place[1]="Bandung";
        obj.place[2]="Surabaya";
        while (true){
            System.out.println("\n===Welcome to Library==");
            System.out.println("1. List Buku");
            System.out.println("2. Tambahkan Buku");
            System.out.print("Pilih menu : ");
            try {
                int menu = input.nextInt();
                if(menu==1){
                    obj.list();
                }else if(menu==2){
                    Scanner input1 = new Scanner(System.in);
                    System.out.print("Nama : ");
                    obj.inName=input1.nextLine();
                    System.out.print("From : ");
                    obj.inFrom=input1.nextLine();
                    obj.cekFrom(obj.inFrom);
                    System.out.print("Date : ");
                    try {
                        obj.inDate=input1.nextInt();
                        obj.cekDate(obj.inDate);
                        String nama = obj.inName+", "+obj.inFrom+". "+obj.inDate;
                        obj.cekName(nama);
                    }catch (InputMismatchException e){
                        System.out.println("Error : "+e);
                    }
                }else {
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("Error: "+e);
                break;
            }
        }
    }
}