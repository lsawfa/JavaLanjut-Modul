package com.example.tb;
public class Bilangan {
    private String angka;
    private int basis;
    private int angkaMaks;
    private char[] simbolAngka;
    
    public void Bilangan(String angka, int basis) {
        this.setAngka(angka);
        init(basis);
    }
    
    private void init(int basis) {
        if (basis == 2) {
            this.setBasis(2);
            this.angkaMaks = 1;
            this.simbolAngka = new char[]{'0','1'};
        } else if(basis == 8) {
            this.setBasis(8);
            this.angkaMaks = 7;
            this.simbolAngka = new char[] {'0','1','2','3','4','5','6','7'};
        } else if (basis == 10) {    
            this.setBasis(10);
            this.angkaMaks = 9;
            this.simbolAngka = new char[] {'0','1','2','3','4','5','6','7','8','9'};       
        } else if(basis==16){
            this.setBasis(16);
            this.angkaMaks = 15;
            this.simbolAngka = new char[] {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        } else{
            System.out.println("Basis is not found");
        }
    }

    public String getAngka() {
        return angka;
    }

    public void setAngka(String angka) {
        this.angka = angka;
    }

    public int getBasis() {
        return basis;
    }

    public void setBasis(int basis) {
        this.basis = basis;
    }

    public int getAngkaMaks() {
        return angkaMaks;
    }

    public char[] getSimbolAngka() {
        return simbolAngka;
    }
    
}
