package Tugas1;

import java.util.Scanner;

public class Tugas1 extends Exception{
    Scanner inputUser = new Scanner(System.in);
    public Tugas1(String s){
        super(s);
    }
    private long nim, notelepon;
    private String nama, email;
    private int umur;

    public long getNim() {
        return nim;
    }

    public void setNim(long nim) {
        this.nim = nim;
    }

    public long getNotelepon() {
        return notelepon;
    }

    public void setNotelepon(long notelepon) {
        this.notelepon = notelepon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void inputnama() {
        while (true) {
            System.out.print("Input your name : ");
            setNama(inputUser.nextLine());
            if(getNama().contains("0")||getNama().contains("1")||getNama().contains("2")||getNama().contains("3")||getNama().contains("4")||getNama().contains("5")||getNama().contains("6")||getNama().contains("7")||getNama().contains("8")||getNama().contains("9")){
                try{
                    throw new Tugas1("Error : Nama tidak boleh mengandung angka");
                }catch (Tugas1 e){
                    System.out.println(e.getMessage());
                }
            }else {
                break;
            }
        }
    }
    public void inputnim() {
        String inputan;
        while (true){
            System.out.print("Input your NIM : ");
            inputan=inputUser.nextLine();
            try {
                setNim(Long.parseLong(inputan));
                if(String.valueOf(getNim()).contains("10370311")){
                    if(String.valueOf(getNim()).length()==15){
                        break;
                    }else if(String.valueOf(getNim()).length()>15){
                        try{
                            throw new Tugas1("NIM tidak boleh lebih dari 15 digit");
                        }catch (Tugas1 e){
                            System.out.println("Error : "+e.getMessage());
                        }
                    }else if(String.valueOf(getNim()).length()<15){
                        try{
                            throw new Tugas1("NIM tidak boleh kurang dari 15 digit");
                        }catch (Tugas1 e){
                            System.out.println("Error : "+e.getMessage());
                        }
                    }
                }else {
                    try{
                        throw new Tugas1("NIM must contain \"10370311\"");
                    }catch (Tugas1 e){
                        System.out.println("Error : "+e.getMessage());
                    }
                }
            }catch (Exception e){
                System.out.println("Error : Input harus berupa angka and"+e);
            }
        }
    }
    public void inputEmail(){
        while (true){
            System.out.print("Input your e-mail : ");
            setEmail(inputUser.nextLine());
            if(getEmail().contains("@webmail.umm.ac.id")){
                break;
            }else{
                try{
                    throw new Tugas1("Error : Email harus berisi @webmail.umm.ac.id");
                }catch (Tugas1 e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    public void inputTelepon() {
        String inputan;
        while (true) {
            System.out.print("Input your telepon number : ");
            inputan=inputUser.nextLine();
            try {
                setNotelepon(Long.parseLong(inputan));
                if(String.valueOf(getNotelepon()).length()>=10&&String.valueOf(getNotelepon()).length()<=15){
                    break;
                }else {
                    try{
                        throw new Tugas1("Error : Digit your telepon number is not valid");
                    }catch (Tugas1 e){
                        System.out.println(e.getMessage());
                    }
                }
            }catch (Exception e){
                System.out.println("Error : Input harus berupa angka and "+e);
            }
        }
    }
    public void inputUmur() {
        String inputan;
        while (true) {
            System.out.print("Input your age : ");
            inputan=inputUser.nextLine();
            try {
                setUmur(Integer.parseInt(inputan));
                break;
            }catch (Exception e){
                System.out.println("Error : Input harus berupa angka and "+e);
            }
        }
    }
    public static void main(String[] args) {
        Tugas1 obj = new Tugas1("");
        System.out.println("=== PROGRAM INPUT DATA MAHASISWA INFORMATIKA ===");
        obj.inputnama();
        obj.inputnim();
        obj.inputEmail();
        obj.inputTelepon();
        obj.inputUmur();
        System.out.println("\n=== Data yang Terekam ===");
        System.out.println("Nama \t: "+obj.getNama());
        System.out.println("NIM \t: "+obj.getNim());
        System.out.println("Email \t: "+obj.getEmail());
        System.out.println("Telepon : "+obj.getNotelepon());
        System.out.println("Umur \t: "+obj.getUmur());
    }
}